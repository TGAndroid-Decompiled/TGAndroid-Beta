package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class by0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final ry0 f25141a;

    public by0(ry0 ry0Var) {
        this.f25141a = ry0Var;
    }

    @Override
    public void m(int i10) {
        ry0.B(this.f25141a, i10);
    }

    @Override
    public void run(String str) {
        new a50(r1.getContext(), r1.f30625o0, null, this.f25141a.resourcesProvider).show();
    }
}
