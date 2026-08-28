package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class a8 implements MessagesStorage.BooleanCallback {
    public final qn f36388a;
    public final b8 f36389b;

    public a8(b8 b8Var, qn qnVar) {
        this.f36389b = b8Var;
        this.f36388a = qnVar;
    }

    @Override
    public final void run(boolean z10) {
        d8 d8Var = this.f36389b.f36734b;
        d8Var.f37442x.finishFragment();
        g8 g8Var = d8Var.f37442x;
        this.f36388a.S7(g8Var.L, g8Var.M + 86400, z10);
    }
}
