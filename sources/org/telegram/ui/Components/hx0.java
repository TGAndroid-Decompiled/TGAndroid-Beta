package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class hx0 implements org.telegram.ui.ActionBar.s0, MessagesStorage.StringCallback {
    public final xx0 f27645a;

    public hx0(xx0 xx0Var) {
        this.f27645a = xx0Var;
    }

    @Override
    public void h(int i10) {
        xx0.C(this.f27645a, i10);
    }

    @Override
    public void run(String str) {
        new a50(r1.getContext(), r1.f33235l0, null, this.f27645a.resourcesProvider).show();
    }
}
