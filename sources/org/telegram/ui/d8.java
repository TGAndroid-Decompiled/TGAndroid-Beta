package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class d8 implements MessagesStorage.BooleanCallback {
    public final eo f36672a;
    public final e8 f36673b;

    public d8(e8 e8Var, eo eoVar) {
        this.f36673b = e8Var;
        this.f36672a = eoVar;
    }

    @Override
    public final void run(boolean z10) {
        g8 g8Var = this.f36673b.f37026b;
        g8Var.f37976x.finishFragment();
        j8 j8Var = g8Var.f37976x;
        this.f36672a.V7(j8Var.P, j8Var.Q + 86400, z10);
    }
}
