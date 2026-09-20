package org.telegram.ui;

import android.view.View;
public final class b21 implements org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.a2 {
    public final ProxyListActivity f32243a;

    public b21(ProxyListActivity proxyListActivity) {
        this.f32243a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f32243a;
        if (i10 >= proxyListActivity.f31706n && i10 < proxyListActivity.f31707r) {
            proxyListActivity.f31702a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.f32243a);
    }
}
