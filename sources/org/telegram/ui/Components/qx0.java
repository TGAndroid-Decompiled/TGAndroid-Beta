package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class qx0 implements org.telegram.ui.ActionBar.s0, MessagesStorage.StringCallback {
    public final hy0 f26492a;

    public qx0(hy0 hy0Var) {
        this.f26492a = hy0Var;
    }

    @Override
    public void m(int i10) {
        hy0.C(this.f26492a, i10);
    }

    @Override
    public void run(String str) {
        new g50(r1.getContext(), r1.f23820o0, null, this.f26492a.resourcesProvider).show();
    }
}
