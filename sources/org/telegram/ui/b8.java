package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class b8 implements MessagesStorage.BooleanCallback {
    public final eo f31178a;
    public final c8 f31179b;

    public b8(c8 c8Var, eo eoVar) {
        this.f31179b = c8Var;
        this.f31178a = eoVar;
    }

    @Override
    public final void run(boolean z10) {
        e8 e8Var = this.f31179b.f31560b;
        e8Var.f32117x.finishFragment();
        h8 h8Var = e8Var.f32117x;
        this.f31178a.S7(h8Var.P, h8Var.Q + 86400, z10);
    }
}
