package org.telegram.ui;

import android.view.View;
public final class az0 implements org.telegram.ui.Components.ik0, org.telegram.ui.ActionBar.u1 {
    public final ProxyListActivity f35912a;

    public az0(ProxyListActivity proxyListActivity) {
        this.f35912a = proxyListActivity;
    }

    @Override
    public boolean f(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f35912a;
        if (i10 >= proxyListActivity.f33961n && i10 < proxyListActivity.f33962r) {
            proxyListActivity.f33957a.M(i10);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ProxyListActivity.Z(this.f35912a);
    }
}
