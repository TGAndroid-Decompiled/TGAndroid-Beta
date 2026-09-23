package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class ex0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final ux0 f23756a;

    public ex0(ux0 ux0Var) {
        this.f23756a = ux0Var;
    }

    @Override
    public void m(int i10) {
        ux0.B(this.f23756a, i10);
    }

    @Override
    public void run(String str) {
        new x40(r1.getContext(), r1.f28583o0, null, this.f23756a.resourcesProvider).show();
    }
}
