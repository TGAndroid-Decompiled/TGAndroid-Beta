package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class rx0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final hy0 f27989a;

    public rx0(hy0 hy0Var) {
        this.f27989a = hy0Var;
    }

    @Override
    public void m(int i10) {
        hy0.B(this.f27989a, i10);
    }

    @Override
    public void run(String str) {
        new w40(r1.getContext(), r1.f24769o0, null, this.f27989a.resourcesProvider).show();
    }
}
