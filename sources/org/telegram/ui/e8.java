package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class e8 implements MessagesStorage.BooleanCallback {
    public final qn f36571a;
    public final f8 f36572b;

    public e8(f8 f8Var, qn qnVar) {
        this.f36572b = f8Var;
        this.f36571a = qnVar;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f36572b.f36917b;
        h8Var.f37542x.finishFragment();
        k8 k8Var = h8Var.f37542x;
        this.f36571a.V7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
