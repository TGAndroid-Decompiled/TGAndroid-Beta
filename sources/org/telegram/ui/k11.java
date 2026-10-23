package org.telegram.ui;

import android.view.View;
public final class k11 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.z1 {
    public final ProxyListActivity f38746a;

    public k11(ProxyListActivity proxyListActivity) {
        this.f38746a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f38746a;
        if (i10 >= proxyListActivity.f34071n && i10 < proxyListActivity.f34072r) {
            proxyListActivity.f34067a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ProxyListActivity.V(this.f38746a);
    }
}
