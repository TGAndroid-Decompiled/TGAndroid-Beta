package org.telegram.ui;

import android.view.View;
public final class d21 implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.a2 {
    public final ProxyListActivity f32919a;

    public d21(ProxyListActivity proxyListActivity) {
        this.f32919a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f32919a;
        if (i10 >= proxyListActivity.f31419n && i10 < proxyListActivity.f31420r) {
            proxyListActivity.f31415a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.f32919a);
    }
}
