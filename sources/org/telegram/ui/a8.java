package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class a8 implements MessagesStorage.BooleanCallback {
    public final zn f35868a;
    public final b8 f35869b;

    public a8(b8 b8Var, zn znVar) {
        this.f35869b = b8Var;
        this.f35868a = znVar;
    }

    @Override
    public final void run(boolean z10) {
        d8 d8Var = this.f35869b.f36157b;
        d8Var.f36888x.finishFragment();
        g8 g8Var = d8Var.f36888x;
        this.f35868a.V7(g8Var.P, g8Var.Q + 86400, z10);
    }
}
