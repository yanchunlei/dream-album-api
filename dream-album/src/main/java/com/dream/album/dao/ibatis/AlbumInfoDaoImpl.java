package com.dream.album.dao.ibatis;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.dream.album.dao.AlbumTemplateCreatedInfoDao;
import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * @author liuxinglong
 * @date 2016年12月6日
 */
@Repository("albumTemplateCreatedInfoDao")
public abstract class AlbumTemplateCreatedInfoDaoImpl extends AlbumTemplateCreatedInfoDao {
    @Resource(name = "ios-dream-sql-client")
    private SqlMapClient sqlMapClient;

    @Override
    public SqlMapClient getSqlMapClient() {
        return sqlMapClient;
    }
}