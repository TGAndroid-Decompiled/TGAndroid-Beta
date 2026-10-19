package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class e8 implements MessagesStorage.BooleanCallback {
    public final qn f36560a;
    public final f8 f36561b;

    public e8(f8 f8Var, qn qnVar) {
        this.f36561b = f8Var;
        this.f36560a = qnVar;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f36561b.f36906b;
        h8Var.f37531x.finishFragment();
        k8 k8Var = h8Var.f37531x;
        this.f36560a.V7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
