package org.telegram.ui;

import android.view.View;
public final class ox0 implements org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.q1 {
    public final ProxyListActivity f50667a;

    public ox0(ProxyListActivity proxyListActivity) {
        this.f50667a = proxyListActivity;
    }

    @Override
    public boolean c(int i7, View view) {
        ProxyListActivity proxyListActivity = this.f50667a;
        if (i7 >= proxyListActivity.f43739n && i7 < proxyListActivity.f43740r) {
            proxyListActivity.f43734a.M(i7);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ProxyListActivity.a0(this.f50667a);
    }
}
