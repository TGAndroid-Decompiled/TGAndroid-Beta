package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class e8 implements MessagesStorage.BooleanCallback {
    public final sn f36419a;
    public final f8 f36420b;

    public e8(f8 f8Var, sn snVar) {
        this.f36420b = f8Var;
        this.f36419a = snVar;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f36420b.f36824b;
        h8Var.f37458x.finishFragment();
        k8 k8Var = h8Var.f37458x;
        this.f36419a.V7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
