package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class gx0 implements org.telegram.ui.ActionBar.s0, MessagesStorage.StringCallback {
    public final wx0 f24416a;

    public gx0(wx0 wx0Var) {
        this.f24416a = wx0Var;
    }

    @Override
    public void m(int i10) {
        wx0.B(this.f24416a, i10);
    }

    @Override
    public void run(String str) {
        new w40(r1.getContext(), r1.f29786o0, null, this.f24416a.resourcesProvider).show();
    }
}
