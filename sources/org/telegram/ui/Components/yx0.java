package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class yx0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final oy0 f32778a;

    public yx0(oy0 oy0Var) {
        this.f32778a = oy0Var;
    }

    @Override
    public void j(int i10) {
        oy0.D(this.f32778a, i10);
    }

    @Override
    public void run(String str) {
        new g50(r1.getContext(), r1.f29104o0, null, this.f32778a.resourcesProvider).show();
    }
}
