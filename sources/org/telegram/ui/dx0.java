package org.telegram.ui;

import android.view.View;
public final class dx0 implements org.telegram.ui.Components.hj0, org.telegram.ui.ActionBar.p1 {
    public final ProxyListActivity f44825a;

    public dx0(ProxyListActivity proxyListActivity) {
        this.f44825a = proxyListActivity;
    }

    @Override
    public boolean f(int i3, View view) {
        ProxyListActivity proxyListActivity = this.f44825a;
        if (i3 >= proxyListActivity.f41909n && i3 < proxyListActivity.f41910r) {
            proxyListActivity.f41904a.M(i3);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        ProxyListActivity.a0(this.f44825a);
    }
}
