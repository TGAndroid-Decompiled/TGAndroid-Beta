package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class d8 implements MessagesStorage.BooleanCallback {
    public final eo f36674a;
    public final e8 f36675b;

    public d8(e8 e8Var, eo eoVar) {
        this.f36675b = e8Var;
        this.f36674a = eoVar;
    }

    @Override
    public final void run(boolean z10) {
        g8 g8Var = this.f36675b.f37030b;
        g8Var.f37974x.finishFragment();
        j8 j8Var = g8Var.f37974x;
        this.f36674a.V7(j8Var.P, j8Var.Q + 86400, z10);
    }
}
