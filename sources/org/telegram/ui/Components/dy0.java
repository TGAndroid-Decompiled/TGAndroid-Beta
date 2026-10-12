package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class dy0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final ty0 f24507a;

    public dy0(ty0 ty0Var) {
        this.f24507a = ty0Var;
    }

    @Override
    public void l(int i10) {
        ty0.E(this.f24507a, i10);
    }

    @Override
    public void run(String str) {
        new k50(r1.getContext(), r1.f29518o0, null, this.f24507a.resourcesProvider).show();
    }
}
