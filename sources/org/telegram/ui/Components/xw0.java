package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class xw0 implements org.telegram.ui.ActionBar.s0, MessagesStorage.StringCallback {
    public final nx0 f34839a;

    public xw0(nx0 nx0Var) {
        this.f34839a = nx0Var;
    }

    @Override
    public void i(int i10) {
        nx0.C(this.f34839a, i10);
    }

    @Override
    public void run(String str) {
        new u40(r1.getContext(), r1.f31182k0, null, this.f34839a.resourcesProvider).show();
    }
}
