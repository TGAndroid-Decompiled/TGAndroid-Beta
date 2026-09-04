package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class b8 implements MessagesStorage.BooleanCallback {
    public final co f34646a;
    public final c8 f34647b;

    public b8(c8 c8Var, co coVar) {
        this.f34647b = c8Var;
        this.f34646a = coVar;
    }

    @Override
    public final void run(boolean z10) {
        e8 e8Var = this.f34647b.f35021b;
        e8Var.f35971x.finishFragment();
        h8 h8Var = e8Var.f35971x;
        this.f34646a.S7(h8Var.P, h8Var.Q + 86400, z10);
    }
}
