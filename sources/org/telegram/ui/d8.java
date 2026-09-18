package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class d8 implements MessagesStorage.BooleanCallback {
    public final bo f33038a;
    public final e8 f33039b;

    public d8(e8 e8Var, bo boVar) {
        this.f33039b = e8Var;
        this.f33038a = boVar;
    }

    @Override
    public final void run(boolean z10) {
        g8 g8Var = this.f33039b.f33326b;
        g8Var.f33909x.finishFragment();
        j8 j8Var = g8Var.f33909x;
        this.f33038a.S7(j8Var.P, j8Var.Q + 86400, z10);
    }
}
