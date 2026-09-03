package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class hx0 implements org.telegram.ui.ActionBar.s0, MessagesStorage.StringCallback {
    public final xx0 f25511a;

    public hx0(xx0 xx0Var) {
        this.f25511a = xx0Var;
    }

    @Override
    public void m(int i10) {
        xx0.C(this.f25511a, i10);
    }

    @Override
    public void run(String str) {
        new z40(r1.getContext(), r1.f30763l0, null, this.f25511a.resourcesProvider).show();
    }
}
