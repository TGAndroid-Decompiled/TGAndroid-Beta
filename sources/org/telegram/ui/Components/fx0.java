package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class fx0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final vx0 f24105a;

    public fx0(vx0 vx0Var) {
        this.f24105a = vx0Var;
    }

    @Override
    public void m(int i10) {
        vx0.B(this.f24105a, i10);
    }

    @Override
    public void run(String str) {
        new w40(r1.getContext(), r1.f29468o0, null, this.f24105a.resourcesProvider).show();
    }
}
