package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class dy0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final ty0 f25752a;

    public dy0(ty0 ty0Var) {
        this.f25752a = ty0Var;
    }

    @Override
    public void h(int i10) {
        ty0.E(this.f25752a, i10);
    }

    @Override
    public void run(String str) {
        new g50(r1.getContext(), r1.f30944o0, null, this.f25752a.resourcesProvider).show();
    }
}
