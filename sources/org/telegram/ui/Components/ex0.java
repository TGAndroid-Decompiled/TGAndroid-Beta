package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class ex0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final ux0 f25803a;

    public ex0(ux0 ux0Var) {
        this.f25803a = ux0Var;
    }

    @Override
    public void m(int i10) {
        ux0.C(this.f25803a, i10);
    }

    @Override
    public void run(String str) {
        new w40(r1.getContext(), r1.f31009o0, null, this.f25803a.resourcesProvider).show();
    }
}
