package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class nw0 implements org.telegram.ui.ActionBar.s0, MessagesStorage.StringCallback {
    public final cx0 f31192a;

    public nw0(cx0 cx0Var) {
        this.f31192a = cx0Var;
    }

    @Override
    public void i(int i9) {
        cx0.C(this.f31192a, i9);
    }

    @Override
    public void run(String str) {
        new g40(r1.getContext(), r1.f27584k0, null, this.f31192a.resourcesProvider).show();
    }
}
