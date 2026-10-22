package org.telegram.ui;

import android.view.View;
public final class g11 implements org.telegram.ui.Components.zl0, org.telegram.ui.ActionBar.a2 {
    public final ProxyListActivity f37172a;

    public g11(ProxyListActivity proxyListActivity) {
        this.f37172a = proxyListActivity;
    }

    @Override
    public boolean a(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f37172a;
        if (i10 >= proxyListActivity.f33773n && i10 < proxyListActivity.f33774r) {
            proxyListActivity.f33769a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.f37172a);
    }
}
