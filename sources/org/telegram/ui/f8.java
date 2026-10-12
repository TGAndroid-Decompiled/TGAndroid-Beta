package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class f8 implements MessagesStorage.BooleanCallback {
    public final fo f35749a;
    public final g8 f35750b;

    public f8(g8 g8Var, fo foVar) {
        this.f35750b = g8Var;
        this.f35749a = foVar;
    }

    @Override
    public final void run(boolean z10) {
        i8 i8Var = this.f35750b.f36338b;
        i8Var.f37064x.finishFragment();
        l8 l8Var = i8Var.f37064x;
        this.f35749a.V7(l8Var.P, l8Var.Q + 86400, z10);
    }
}
