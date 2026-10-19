package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class zx0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final py0 f33052a;

    public zx0(py0 py0Var) {
        this.f33052a = py0Var;
    }

    @Override
    public void j(int i10) {
        py0.D(this.f33052a, i10);
    }

    @Override
    public void run(String str) {
        new g50(r1.getContext(), r1.f29434o0, null, this.f33052a.resourcesProvider).show();
    }
}
