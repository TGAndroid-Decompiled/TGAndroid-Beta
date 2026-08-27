package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

public final class b8 implements MessagesStorage.BooleanCallback {

    public final rn f36720a;

    public final c8 f36721b;

    public b8(c8 c8Var, rn rnVar) {
        this.f36721b = c8Var;
        this.f36720a = rnVar;
    }

    @Override
    public final void run(boolean z10) {
        e8 e8Var = this.f36721b.f36993b;
        e8Var.f37662x.finishFragment();
        h8 h8Var = e8Var.f37662x;
        this.f36720a.S7(h8Var.L, h8Var.M + 86400, z10);
    }
}
