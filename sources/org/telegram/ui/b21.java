package org.telegram.ui;

import android.view.View;
public final class b21 implements org.telegram.ui.Components.ml0, org.telegram.ui.ActionBar.a2 {
    public final ProxyListActivity f32224a;

    public b21(ProxyListActivity proxyListActivity) {
        this.f32224a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f32224a;
        if (i10 >= proxyListActivity.f31666n && i10 < proxyListActivity.f31667r) {
            proxyListActivity.f31662a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.f32224a);
    }
}
