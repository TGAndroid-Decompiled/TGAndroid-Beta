package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class d8 implements MessagesStorage.BooleanCallback {
    public final bo f33034a;
    public final e8 f33035b;

    public d8(e8 e8Var, bo boVar) {
        this.f33035b = e8Var;
        this.f33034a = boVar;
    }

    @Override
    public final void run(boolean z10) {
        g8 g8Var = this.f33035b.f33322b;
        g8Var.f33905x.finishFragment();
        j8 j8Var = g8Var.f33905x;
        this.f33034a.S7(j8Var.P, j8Var.Q + 86400, z10);
    }
}
