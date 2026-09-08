package org.telegram.ui;

import android.view.View;
public final class e21 implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.a2 {
    public final ProxyListActivity f35940a;

    public e21(ProxyListActivity proxyListActivity) {
        this.f35940a = proxyListActivity;
    }

    @Override
    public boolean a(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f35940a;
        if (i10 >= proxyListActivity.f34070r && i10 < proxyListActivity.f34071s) {
            proxyListActivity.f34064a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.f35940a);
    }
}
