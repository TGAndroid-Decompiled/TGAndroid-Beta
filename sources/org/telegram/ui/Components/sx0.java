package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class sx0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final iy0 f28361a;

    public sx0(iy0 iy0Var) {
        this.f28361a = iy0Var;
    }

    @Override
    public void m(int i10) {
        iy0.B(this.f28361a, i10);
    }

    @Override
    public void run(String str) {
        new a50(r1.getContext(), r1.f25228o0, null, this.f28361a.resourcesProvider).show();
    }
}
