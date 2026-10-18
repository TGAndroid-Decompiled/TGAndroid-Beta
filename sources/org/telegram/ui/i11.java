package org.telegram.ui;

import android.view.View;
public final class i11 implements org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.a2 {
    public final ProxyListActivity f37733a;

    public i11(ProxyListActivity proxyListActivity) {
        this.f37733a = proxyListActivity;
    }

    @Override
    public boolean a(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f37733a;
        if (i10 >= proxyListActivity.f33762n && i10 < proxyListActivity.f33763r) {
            proxyListActivity.f33758a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.f37733a);
    }
}
