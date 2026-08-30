package org.telegram.ui;

import android.view.View;
public final class k11 implements org.telegram.ui.Components.kl0, org.telegram.ui.ActionBar.c2 {
    public final ProxyListActivity f35544a;

    public k11(ProxyListActivity proxyListActivity) {
        this.f35544a = proxyListActivity;
    }

    @Override
    public boolean f(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f35544a;
        if (i10 >= proxyListActivity.f32211r && i10 < proxyListActivity.f32212s) {
            proxyListActivity.f32206a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ProxyListActivity.V(this.f35544a);
    }
}
