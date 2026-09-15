package org.telegram.ui;

import android.view.View;
public final class c21 implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.a2 {
    public final ProxyListActivity f32647a;

    public c21(ProxyListActivity proxyListActivity) {
        this.f32647a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f32647a;
        if (i10 >= proxyListActivity.f31422n && i10 < proxyListActivity.f31423r) {
            proxyListActivity.f31418a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.f32647a);
    }
}
