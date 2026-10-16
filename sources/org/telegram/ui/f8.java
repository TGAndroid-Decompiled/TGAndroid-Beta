package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class f8 implements MessagesStorage.BooleanCallback {
    public final fo f35471a;
    public final g8 f35472b;

    public f8(g8 g8Var, fo foVar) {
        this.f35472b = g8Var;
        this.f35471a = foVar;
    }

    @Override
    public final void run(boolean z10) {
        i8 i8Var = this.f35472b.f36095b;
        i8Var.f36752x.finishFragment();
        l8 l8Var = i8Var.f36752x;
        this.f35471a.V7(l8Var.P, l8Var.Q + 86400, z10);
    }
}
