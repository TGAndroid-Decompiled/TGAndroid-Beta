package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class c8 implements MessagesStorage.BooleanCallback {
    public final zn f32683a;
    public final d8 f32684b;

    public c8(d8 d8Var, zn znVar) {
        this.f32684b = d8Var;
        this.f32683a = znVar;
    }

    @Override
    public final void run(boolean z10) {
        f8 f8Var = this.f32684b.f32975b;
        f8Var.f33564x.finishFragment();
        i8 i8Var = f8Var.f33564x;
        this.f32683a.S7(i8Var.P, i8Var.Q + 86400, z10);
    }
}
