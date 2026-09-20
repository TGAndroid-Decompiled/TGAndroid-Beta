package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class qx0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final gy0 f27679a;

    public qx0(gy0 gy0Var) {
        this.f27679a = gy0Var;
    }

    @Override
    public void m(int i10) {
        gy0.B(this.f27679a, i10);
    }

    @Override
    public void run(String str) {
        new w40(r1.getContext(), r1.f24493o0, null, this.f27679a.resourcesProvider).show();
    }
}
