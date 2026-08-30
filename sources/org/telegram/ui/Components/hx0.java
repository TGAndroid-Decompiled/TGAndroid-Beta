package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class hx0 implements org.telegram.ui.ActionBar.s0, MessagesStorage.StringCallback {
    public final xx0 f25512a;

    public hx0(xx0 xx0Var) {
        this.f25512a = xx0Var;
    }

    @Override
    public void l(int i10) {
        xx0.C(this.f25512a, i10);
    }

    @Override
    public void run(String str) {
        new y40(r1.getContext(), r1.f30781l0, null, this.f25512a.resourcesProvider).show();
    }
}
