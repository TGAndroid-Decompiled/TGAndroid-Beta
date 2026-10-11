package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class jy0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final zy0 f27774a;

    public jy0(zy0 zy0Var) {
        this.f27774a = zy0Var;
    }

    @Override
    public void m(int i10) {
        zy0.E(this.f27774a, i10);
    }

    @Override
    public void run(String str) {
        new p50(r1.getContext(), r1.f33706o0, null, this.f27774a.resourcesProvider).show();
    }
}
