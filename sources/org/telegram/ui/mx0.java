package org.telegram.ui;

import android.view.View;
public final class mx0 implements org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.q1 {
    public final ProxyListActivity f50145a;

    public mx0(ProxyListActivity proxyListActivity) {
        this.f50145a = proxyListActivity;
    }

    @Override
    public boolean b(int i7, View view) {
        ProxyListActivity proxyListActivity = this.f50145a;
        if (i7 >= proxyListActivity.f43824n && i7 < proxyListActivity.f43825r) {
            proxyListActivity.f43819a.M(i7);
            return true;
        }
        return false;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ProxyListActivity.a0(this.f50145a);
    }
}
