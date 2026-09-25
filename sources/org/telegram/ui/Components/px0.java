package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class px0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final fy0 f27442a;

    public px0(fy0 fy0Var) {
        this.f27442a = fy0Var;
    }

    @Override
    public void m(int i10) {
        fy0.B(this.f27442a, i10);
    }

    @Override
    public void run(String str) {
        new x40(r1.getContext(), r1.f24303o0, null, this.f27442a.resourcesProvider).show();
    }
}
