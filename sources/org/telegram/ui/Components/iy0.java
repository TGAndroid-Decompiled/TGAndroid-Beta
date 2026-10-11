package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class iy0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final yy0 f27530a;

    public iy0(yy0 yy0Var) {
        this.f27530a = yy0Var;
    }

    @Override
    public void m(int i10) {
        yy0.E(this.f27530a, i10);
    }

    @Override
    public void run(String str) {
        new p50(r1.getContext(), r1.f33492o0, null, this.f27530a.resourcesProvider).show();
    }
}
