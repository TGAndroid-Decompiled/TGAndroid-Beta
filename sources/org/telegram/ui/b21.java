package org.telegram.ui;

import android.view.View;
public final class b21 implements org.telegram.ui.Components.gm0, org.telegram.ui.ActionBar.a2 {
    public final ProxyListActivity f36109a;

    public b21(ProxyListActivity proxyListActivity) {
        this.f36109a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f36109a;
        if (i10 >= proxyListActivity.f34397n && i10 < proxyListActivity.f34398r) {
            proxyListActivity.f34392a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.f36109a);
    }
}
