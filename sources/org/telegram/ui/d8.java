package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class d8 implements MessagesStorage.BooleanCallback {
    public final xn f36109a;
    public final e8 f36110b;

    public d8(e8 e8Var, xn xnVar) {
        this.f36110b = e8Var;
        this.f36109a = xnVar;
    }

    @Override
    public final void run(boolean z4) {
        g8 g8Var = this.f36110b.f36382b;
        g8Var.f37021x.finishFragment();
        j8 j8Var = g8Var.f37021x;
        this.f36109a.S7(j8Var.M, j8Var.N + 86400, z4);
    }
}
