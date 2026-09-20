package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class c8 implements MessagesStorage.BooleanCallback {
    public final zn f32663a;
    public final d8 f32664b;

    public c8(d8 d8Var, zn znVar) {
        this.f32664b = d8Var;
        this.f32663a = znVar;
    }

    @Override
    public final void run(boolean z10) {
        f8 f8Var = this.f32664b.f32954b;
        f8Var.f33539x.finishFragment();
        i8 i8Var = f8Var.f33539x;
        this.f32663a.S7(i8Var.P, i8Var.Q + 86400, z10);
    }
}
