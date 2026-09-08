package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class b8 implements MessagesStorage.BooleanCallback {
    public final co f34673a;
    public final c8 f34674b;

    public b8(c8 c8Var, co coVar) {
        this.f34674b = c8Var;
        this.f34673a = coVar;
    }

    @Override
    public final void run(boolean z10) {
        e8 e8Var = this.f34674b.f35048b;
        e8Var.f35998x.finishFragment();
        h8 h8Var = e8Var.f35998x;
        this.f34673a.S7(h8Var.P, h8Var.Q + 86400, z10);
    }
}
