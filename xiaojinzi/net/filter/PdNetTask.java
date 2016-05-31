package xiaojinzi.net.filter;

import android.app.ProgressDialog;

import xiaojinzi.base.java.net.NetTask;

/**
 * Created by cxj on 2016/5/30.
 */
public class PdNetTask<Parameter> extends NetTask<Parameter> {

    /**
     * 进度条控件
     */
    private ProgressDialog pd;

    public ProgressDialog getPd() {
        return pd;
    }

    public void setPd(ProgressDialog pd) {
        this.pd = pd;
    }
}
