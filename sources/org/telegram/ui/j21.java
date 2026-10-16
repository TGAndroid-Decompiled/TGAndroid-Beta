package org.telegram.ui;

import android.view.View;
public final class j21 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.z1 {
    public final ProxyListActivity f36913a;

    public j21(ProxyListActivity proxyListActivity) {
        this.f36913a = proxyListActivity;
    }

    @Override
    public boolean a(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f36913a;
        if (i10 >= proxyListActivity.f32415n && i10 < proxyListActivity.f32416r) {
            proxyListActivity.f32411a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ProxyListActivity.V(this.f36913a);
    }
}
