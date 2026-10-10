package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class a8 implements MessagesStorage.BooleanCallback {
    public final zn f35914a;
    public final b8 f35915b;

    public a8(b8 b8Var, zn znVar) {
        this.f35915b = b8Var;
        this.f35914a = znVar;
    }

    @Override
    public final void run(boolean z10) {
        d8 d8Var = this.f35915b.f36203b;
        d8Var.f36934x.finishFragment();
        g8 g8Var = d8Var.f36934x;
        this.f35914a.V7(g8Var.P, g8Var.Q + 86400, z10);
    }
}
