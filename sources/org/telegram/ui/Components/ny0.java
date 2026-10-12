package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class ny0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final dz0 f28985a;

    public ny0(dz0 dz0Var) {
        this.f28985a = dz0Var;
    }

    @Override
    public void m(int i10) {
        dz0.E(this.f28985a, i10);
    }

    @Override
    public void run(String str) {
        new r50(r1.getContext(), r1.f25500o0, null, this.f28985a.resourcesProvider).show();
    }
}
