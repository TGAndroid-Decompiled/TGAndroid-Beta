package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class qx0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final gy0 f27773a;

    public qx0(gy0 gy0Var) {
        this.f27773a = gy0Var;
    }

    @Override
    public void m(int i10) {
        gy0.B(this.f27773a, i10);
    }

    @Override
    public void run(String str) {
        new y40(r1.getContext(), r1.f24615o0, null, this.f27773a.resourcesProvider).show();
    }
}
