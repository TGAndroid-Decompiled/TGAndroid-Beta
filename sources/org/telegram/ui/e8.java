package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class e8 implements MessagesStorage.BooleanCallback {
    public final yn f35959a;
    public final f8 f35960b;

    public e8(f8 f8Var, yn ynVar) {
        this.f35960b = f8Var;
        this.f35959a = ynVar;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f35960b.f36217b;
        h8Var.f37003x.finishFragment();
        k8 k8Var = h8Var.f37003x;
        this.f35959a.S7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
