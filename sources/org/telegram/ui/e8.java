package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class e8 implements MessagesStorage.BooleanCallback {
    public final yn f35953a;
    public final f8 f35954b;

    public e8(f8 f8Var, yn ynVar) {
        this.f35954b = f8Var;
        this.f35953a = ynVar;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f35954b.f36211b;
        h8Var.f36997x.finishFragment();
        k8 k8Var = h8Var.f36997x;
        this.f35953a.S7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
