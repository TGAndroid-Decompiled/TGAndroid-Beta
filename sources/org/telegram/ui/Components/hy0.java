package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class hy0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final xy0 f27156a;

    public hy0(xy0 xy0Var) {
        this.f27156a = xy0Var;
    }

    @Override
    public void m(int i10) {
        xy0.E(this.f27156a, i10);
    }

    @Override
    public void run(String str) {
        new o50(r1.getContext(), r1.f33040o0, null, this.f27156a.resourcesProvider).show();
    }
}
