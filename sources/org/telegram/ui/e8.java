package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class e8 implements MessagesStorage.BooleanCallback {
    public final yn f35978a;
    public final f8 f35979b;

    public e8(f8 f8Var, yn ynVar) {
        this.f35979b = f8Var;
        this.f35978a = ynVar;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f35979b.f36224b;
        h8Var.f37028x.finishFragment();
        k8 k8Var = h8Var.f37028x;
        this.f35978a.S7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
