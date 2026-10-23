package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class e8 implements MessagesStorage.BooleanCallback {
    public final sn f36846a;
    public final f8 f36847b;

    public e8(f8 f8Var, sn snVar) {
        this.f36847b = f8Var;
        this.f36846a = snVar;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f36847b.f37242b;
        h8Var.f37780x.finishFragment();
        k8 k8Var = h8Var.f37780x;
        this.f36846a.V7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
