package org.telegram.ui;

import android.view.View;
public final class a21 implements org.telegram.ui.Components.im0, org.telegram.ui.ActionBar.z1 {
    public final ProxyListActivity f35854a;

    public a21(ProxyListActivity proxyListActivity) {
        this.f35854a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f35854a;
        if (i10 >= proxyListActivity.f34425n && i10 < proxyListActivity.f34426r) {
            proxyListActivity.f34420a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ProxyListActivity.V(this.f35854a);
    }
}
