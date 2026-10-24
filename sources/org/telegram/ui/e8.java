package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class e8 implements MessagesStorage.BooleanCallback {
    public final sn f36829a;
    public final f8 f36830b;

    public e8(f8 f8Var, sn snVar) {
        this.f36830b = f8Var;
        this.f36829a = snVar;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f36830b.f37226b;
        h8Var.f37783x.finishFragment();
        k8 k8Var = h8Var.f37783x;
        this.f36829a.V7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
