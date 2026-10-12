package org.telegram.ui;

import android.view.View;
public final class e21 implements org.telegram.ui.Components.mm0, org.telegram.ui.ActionBar.z1 {
    public final ProxyListActivity f36961a;

    public e21(ProxyListActivity proxyListActivity) {
        this.f36961a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f36961a;
        if (i10 >= proxyListActivity.f34234n && i10 < proxyListActivity.f34235r) {
            proxyListActivity.f34229a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ProxyListActivity.V(this.f36961a);
    }
}
