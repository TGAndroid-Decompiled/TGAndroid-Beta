package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class a8 implements MessagesStorage.BooleanCallback {
    public final zn f35870a;
    public final b8 f35871b;

    public a8(b8 b8Var, zn znVar) {
        this.f35871b = b8Var;
        this.f35870a = znVar;
    }

    @Override
    public final void run(boolean z10) {
        d8 d8Var = this.f35871b.f36159b;
        d8Var.f36890x.finishFragment();
        g8 g8Var = d8Var.f36890x;
        this.f35870a.V7(g8Var.P, g8Var.Q + 86400, z10);
    }
}
