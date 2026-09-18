package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class c8 implements MessagesStorage.BooleanCallback {
    public final zn f32583a;
    public final d8 f32584b;

    public c8(d8 d8Var, zn znVar) {
        this.f32584b = d8Var;
        this.f32583a = znVar;
    }

    @Override
    public final void run(boolean z10) {
        f8 f8Var = this.f32584b.f32889b;
        f8Var.f33466x.finishFragment();
        i8 i8Var = f8Var.f33466x;
        this.f32583a.S7(i8Var.P, i8Var.Q + 86400, z10);
    }
}
