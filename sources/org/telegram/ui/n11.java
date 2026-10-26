package org.telegram.ui;

import android.view.View;
public final class n11 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.b2 {
    public final ProxyListActivity f41741a;

    public n11(ProxyListActivity proxyListActivity) {
        this.f41741a = proxyListActivity;
    }

    @Override
    public boolean c(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f41741a;
        if (i10 >= proxyListActivity.f36137n && i10 < proxyListActivity.f36138r) {
            proxyListActivity.f36133a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        ProxyListActivity.W(this.f41741a);
    }
}
