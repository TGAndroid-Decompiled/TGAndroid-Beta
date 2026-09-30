package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class b8 implements MessagesStorage.BooleanCallback {
    public final wn f32349a;
    public final c8 f32350b;

    public b8(c8 c8Var, wn wnVar) {
        this.f32350b = c8Var;
        this.f32349a = wnVar;
    }

    @Override
    public final void run(boolean z10) {
        e8 e8Var = this.f32350b.f32595b;
        e8Var.f33284x.finishFragment();
        h8 h8Var = e8Var.f33284x;
        this.f32349a.S7(h8Var.P, h8Var.Q + 86400, z10);
    }
}
