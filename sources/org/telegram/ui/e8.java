package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class e8 implements MessagesStorage.BooleanCallback {
    public final qn f36566a;
    public final f8 f36567b;

    public e8(f8 f8Var, qn qnVar) {
        this.f36567b = f8Var;
        this.f36566a = qnVar;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f36567b.f36912b;
        h8Var.f37537x.finishFragment();
        k8 k8Var = h8Var.f37537x;
        this.f36566a.V7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
