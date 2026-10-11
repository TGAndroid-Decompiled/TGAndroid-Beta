package org.telegram.ui;

import android.view.View;
public final class a21 implements org.telegram.ui.Components.hm0, org.telegram.ui.ActionBar.z1 {
    public final ProxyListActivity f35888a;

    public a21(ProxyListActivity proxyListActivity) {
        this.f35888a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f35888a;
        if (i10 >= proxyListActivity.f34459n && i10 < proxyListActivity.f34460r) {
            proxyListActivity.f34454a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ProxyListActivity.V(this.f35888a);
    }
}
