package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class b8 implements MessagesStorage.BooleanCallback {
    public final bo f32075a;
    public final c8 f32076b;

    public b8(c8 c8Var, bo boVar) {
        this.f32076b = c8Var;
        this.f32075a = boVar;
    }

    @Override
    public final void run(boolean z10) {
        e8 e8Var = this.f32076b.f32709b;
        e8Var.f33269x.finishFragment();
        h8 h8Var = e8Var.f33269x;
        this.f32075a.S7(h8Var.P, h8Var.Q + 86400, z10);
    }
}
