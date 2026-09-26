package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class b8 implements MessagesStorage.BooleanCallback {
    public final wn f32345a;
    public final c8 f32346b;

    public b8(c8 c8Var, wn wnVar) {
        this.f32346b = c8Var;
        this.f32345a = wnVar;
    }

    @Override
    public final void run(boolean z10) {
        e8 e8Var = this.f32346b.f32592b;
        e8Var.f33294x.finishFragment();
        h8 h8Var = e8Var.f33294x;
        this.f32345a.S7(h8Var.P, h8Var.Q + 86400, z10);
    }
}
