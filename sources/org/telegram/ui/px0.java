package org.telegram.ui;

import android.view.View;
public final class px0 implements org.telegram.ui.Components.ej0, org.telegram.ui.ActionBar.r1 {
    public final ProxyListActivity f48829a;

    public px0(ProxyListActivity proxyListActivity) {
        this.f48829a = proxyListActivity;
    }

    @Override
    public boolean c(int i7, View view) {
        ProxyListActivity proxyListActivity = this.f48829a;
        if (i7 >= proxyListActivity.f41888n && i7 < proxyListActivity.f41889r) {
            proxyListActivity.f41883a.M(i7);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ProxyListActivity.a0(this.f48829a);
    }
}
