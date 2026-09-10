package org.telegram.ui;

import android.view.View;
public final class i21 implements org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.c2 {
    public final ProxyListActivity f33524a;

    public i21(ProxyListActivity proxyListActivity) {
        this.f33524a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f33524a;
        if (i10 >= proxyListActivity.f30535r && i10 < proxyListActivity.f30536s) {
            proxyListActivity.f30530a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ProxyListActivity.V(this.f33524a);
    }
}
