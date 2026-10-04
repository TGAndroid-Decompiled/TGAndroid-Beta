package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class e8 implements MessagesStorage.BooleanCallback {
    public final yn f35954a;
    public final f8 f35955b;

    public e8(f8 f8Var, yn ynVar) {
        this.f35955b = f8Var;
        this.f35954a = ynVar;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f35955b.f36212b;
        h8Var.f36998x.finishFragment();
        k8 k8Var = h8Var.f36998x;
        this.f35954a.S7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
