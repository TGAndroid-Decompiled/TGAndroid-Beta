package org.telegram.ui;

import android.view.View;
public final class b21 implements org.telegram.ui.Components.hm0, org.telegram.ui.ActionBar.a2 {
    public final ProxyListActivity f36153a;

    public b21(ProxyListActivity proxyListActivity) {
        this.f36153a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f36153a;
        if (i10 >= proxyListActivity.f34435n && i10 < proxyListActivity.f34436r) {
            proxyListActivity.f34430a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.f36153a);
    }
}
