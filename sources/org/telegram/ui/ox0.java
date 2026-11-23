package org.telegram.ui;

import android.view.View;
public final class ox0 implements org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.q1 {
    public final ProxyListActivity f50671a;

    public ox0(ProxyListActivity proxyListActivity) {
        this.f50671a = proxyListActivity;
    }

    @Override
    public boolean c(int i7, View view) {
        ProxyListActivity proxyListActivity = this.f50671a;
        if (i7 >= proxyListActivity.f43743n && i7 < proxyListActivity.f43744r) {
            proxyListActivity.f43738a.M(i7);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ProxyListActivity.a0(this.f50671a);
    }
}
