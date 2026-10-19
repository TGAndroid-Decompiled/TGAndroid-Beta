package org.telegram.ui;

import android.view.View;
public final class g11 implements org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.a2 {
    public final ProxyListActivity f37168a;

    public g11(ProxyListActivity proxyListActivity) {
        this.f37168a = proxyListActivity;
    }

    @Override
    public boolean a(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f37168a;
        if (i10 >= proxyListActivity.f33761n && i10 < proxyListActivity.f33762r) {
            proxyListActivity.f33757a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.f37168a);
    }
}
