package org.telegram.ui;

import android.view.View;
public final class kx0 implements org.telegram.ui.Components.ij0, org.telegram.ui.ActionBar.q1 {
    public final ProxyListActivity f48785a;

    public kx0(ProxyListActivity proxyListActivity) {
        this.f48785a = proxyListActivity;
    }

    @Override
    public boolean b(int i7, View view) {
        ProxyListActivity proxyListActivity = this.f48785a;
        if (i7 >= proxyListActivity.f43252n && i7 < proxyListActivity.f43253r) {
            proxyListActivity.f43247a.N(i7);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ProxyListActivity.a0(this.f48785a);
    }
}
