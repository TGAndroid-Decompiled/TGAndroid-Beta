package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class b8 implements MessagesStorage.BooleanCallback {
    public final co f34647a;
    public final c8 f34648b;

    public b8(c8 c8Var, co coVar) {
        this.f34648b = c8Var;
        this.f34647a = coVar;
    }

    @Override
    public final void run(boolean z10) {
        e8 e8Var = this.f34648b.f35022b;
        e8Var.f35972x.finishFragment();
        h8 h8Var = e8Var.f35972x;
        this.f34647a.S7(h8Var.P, h8Var.Q + 86400, z10);
    }
}
