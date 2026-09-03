package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class f8 implements MessagesStorage.BooleanCallback {
    public final zn f33977a;
    public final g8 f33978b;

    public f8(g8 g8Var, zn znVar) {
        this.f33978b = g8Var;
        this.f33977a = znVar;
    }

    @Override
    public final void run(boolean z4) {
        i8 i8Var = this.f33978b.f34353b;
        i8Var.f34836x.finishFragment();
        l8 l8Var = i8Var.f34836x;
        this.f33977a.S7(l8Var.M, l8Var.N + 86400, z4);
    }
}
