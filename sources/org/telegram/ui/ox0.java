package org.telegram.ui;

import android.view.View;
public final class ox0 implements org.telegram.ui.Components.qj0, org.telegram.ui.ActionBar.r1 {
    public final ProxyListActivity f50634a;

    public ox0(ProxyListActivity proxyListActivity) {
        this.f50634a = proxyListActivity;
    }

    @Override
    public boolean c(int i7, View view) {
        ProxyListActivity proxyListActivity = this.f50634a;
        if (i7 >= proxyListActivity.f43698n && i7 < proxyListActivity.f43699r) {
            proxyListActivity.f43693a.M(i7);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ProxyListActivity.a0(this.f50634a);
    }
}
