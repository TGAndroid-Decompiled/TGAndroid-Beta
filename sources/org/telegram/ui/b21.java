package org.telegram.ui;

import android.view.View;
public final class b21 implements org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.a2 {
    public final ProxyListActivity f32261a;

    public b21(ProxyListActivity proxyListActivity) {
        this.f32261a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f32261a;
        if (i10 >= proxyListActivity.f31727n && i10 < proxyListActivity.f31728r) {
            proxyListActivity.f31723a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.f32261a);
    }
}
