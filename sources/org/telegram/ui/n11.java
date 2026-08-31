package org.telegram.ui;

import android.view.View;
public final class n11 implements org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.c2 {
    public final ProxyListActivity f39265a;

    public n11(ProxyListActivity proxyListActivity) {
        this.f39265a = proxyListActivity;
    }

    @Override
    public boolean f(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f39265a;
        if (i10 >= proxyListActivity.f34745r && i10 < proxyListActivity.f34746s) {
            proxyListActivity.f34739a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ProxyListActivity.V(this.f39265a);
    }
}
