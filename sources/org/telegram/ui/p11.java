package org.telegram.ui;

import android.view.View;
public final class p11 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.b2 {
    public final ProxyListActivity f42274a;

    public p11(ProxyListActivity proxyListActivity) {
        this.f42274a = proxyListActivity;
    }

    @Override
    public boolean c(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f42274a;
        if (i10 >= proxyListActivity.f36161n && i10 < proxyListActivity.f36162r) {
            proxyListActivity.f36157a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        ProxyListActivity.W(this.f42274a);
    }
}
