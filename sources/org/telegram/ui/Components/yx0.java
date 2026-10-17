package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class yx0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final oy0 f32771a;

    public yx0(oy0 oy0Var) {
        this.f32771a = oy0Var;
    }

    @Override
    public void j(int i10) {
        oy0.D(this.f32771a, i10);
    }

    @Override
    public void run(String str) {
        new g50(r1.getContext(), r1.f29097o0, null, this.f32771a.resourcesProvider).show();
    }
}
