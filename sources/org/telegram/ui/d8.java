package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class d8 implements MessagesStorage.BooleanCallback {
    public final xn f36130a;
    public final e8 f36131b;

    public d8(e8 e8Var, xn xnVar) {
        this.f36131b = e8Var;
        this.f36130a = xnVar;
    }

    @Override
    public final void run(boolean z4) {
        g8 g8Var = this.f36131b.f36417b;
        g8Var.f37119x.finishFragment();
        j8 j8Var = g8Var.f37119x;
        this.f36130a.S7(j8Var.M, j8Var.N + 86400, z4);
    }
}
