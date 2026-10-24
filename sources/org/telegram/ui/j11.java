package org.telegram.ui;

import android.view.View;
public final class j11 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.z1 {
    public final ProxyListActivity f38432a;

    public j11(ProxyListActivity proxyListActivity) {
        this.f38432a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f38432a;
        if (i10 >= proxyListActivity.f34073n && i10 < proxyListActivity.f34074r) {
            proxyListActivity.f34069a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ProxyListActivity.V(this.f38432a);
    }
}
