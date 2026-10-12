package org.telegram.ui;

import android.view.View;
public final class j21 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.z1 {
    public final ProxyListActivity f37243a;

    public j21(ProxyListActivity proxyListActivity) {
        this.f37243a = proxyListActivity;
    }

    @Override
    public boolean a(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f37243a;
        if (i10 >= proxyListActivity.f32713n && i10 < proxyListActivity.f32714r) {
            proxyListActivity.f32709a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ProxyListActivity.V(this.f37243a);
    }
}
