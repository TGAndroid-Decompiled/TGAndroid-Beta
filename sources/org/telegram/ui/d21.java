package org.telegram.ui;

import android.view.View;
public final class d21 implements org.telegram.ui.Components.cl0, org.telegram.ui.ActionBar.b2 {
    public final ProxyListActivity f32990a;

    public d21(ProxyListActivity proxyListActivity) {
        this.f32990a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f32990a;
        if (i10 >= proxyListActivity.f31439n && i10 < proxyListActivity.f31440r) {
            proxyListActivity.f31435a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ProxyListActivity.V(this.f32990a);
    }
}
