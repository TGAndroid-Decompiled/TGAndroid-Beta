package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class ix0 implements org.telegram.ui.ActionBar.s0, MessagesStorage.StringCallback {
    public final yx0 f27919a;

    public ix0(yx0 yx0Var) {
        this.f27919a = yx0Var;
    }

    @Override
    public void h(int i10) {
        yx0.C(this.f27919a, i10);
    }

    @Override
    public void run(String str) {
        new a50(r1.getContext(), r1.f33629l0, null, this.f27919a.resourcesProvider).show();
    }
}
