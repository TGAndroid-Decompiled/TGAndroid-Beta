package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class e8 implements MessagesStorage.BooleanCallback {
    public final qn f36567a;
    public final f8 f36568b;

    public e8(f8 f8Var, qn qnVar) {
        this.f36568b = f8Var;
        this.f36567a = qnVar;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f36568b.f36913b;
        h8Var.f37538x.finishFragment();
        k8 k8Var = h8Var.f37538x;
        this.f36567a.V7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
