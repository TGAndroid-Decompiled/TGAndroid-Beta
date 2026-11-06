package org.telegram.ui;

import android.view.View;
public final class lx0 implements org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.r1 {
    public final ProxyListActivity f47599a;

    public lx0(ProxyListActivity proxyListActivity) {
        this.f47599a = proxyListActivity;
    }

    @Override
    public boolean c(int i7, View view) {
        ProxyListActivity proxyListActivity = this.f47599a;
        if (i7 >= proxyListActivity.f41877n && i7 < proxyListActivity.f41878r) {
            proxyListActivity.f41872a.M(i7);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ProxyListActivity.a0(this.f47599a);
    }
}
