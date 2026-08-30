package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class d8 implements MessagesStorage.BooleanCallback {
    public final xn f33529a;
    public final e8 f33530b;

    public d8(e8 e8Var, xn xnVar) {
        this.f33530b = e8Var;
        this.f33529a = xnVar;
    }

    @Override
    public final void run(boolean z4) {
        g8 g8Var = this.f33530b.f33927b;
        g8Var.f34478x.finishFragment();
        j8 j8Var = g8Var.f34478x;
        this.f33529a.S7(j8Var.M, j8Var.N + 86400, z4);
    }
}
