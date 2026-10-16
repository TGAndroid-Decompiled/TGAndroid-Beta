package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class dy0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final uy0 f24201a;

    public dy0(uy0 uy0Var) {
        this.f24201a = uy0Var;
    }

    @Override
    public void k(int i10) {
        uy0.E(this.f24201a, i10);
    }

    @Override
    public void run(String str) {
        new k50(r1.getContext(), r1.f29505o0, null, this.f24201a.resourcesProvider).show();
    }
}
