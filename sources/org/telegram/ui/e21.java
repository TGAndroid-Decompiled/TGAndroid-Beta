package org.telegram.ui;

import android.view.View;
public final class e21 implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.a2 {
    public final ProxyListActivity f35941a;

    public e21(ProxyListActivity proxyListActivity) {
        this.f35941a = proxyListActivity;
    }

    @Override
    public boolean a(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f35941a;
        if (i10 >= proxyListActivity.f34071r && i10 < proxyListActivity.f34072s) {
            proxyListActivity.f34065a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.f35941a);
    }
}
