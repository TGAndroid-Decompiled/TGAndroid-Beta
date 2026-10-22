package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class e8 implements MessagesStorage.BooleanCallback {
    public final qn f36570a;
    public final f8 f36571b;

    public e8(f8 f8Var, qn qnVar) {
        this.f36571b = f8Var;
        this.f36570a = qnVar;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f36571b.f36916b;
        h8Var.f37541x.finishFragment();
        k8 k8Var = h8Var.f37541x;
        this.f36570a.V7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
