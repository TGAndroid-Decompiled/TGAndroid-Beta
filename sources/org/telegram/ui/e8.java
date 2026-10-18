package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class e8 implements MessagesStorage.BooleanCallback {
    public final sn f36386a;
    public final f8 f36387b;

    public e8(f8 f8Var, sn snVar) {
        this.f36387b = f8Var;
        this.f36386a = snVar;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f36387b.f36831b;
        h8Var.f37438x.finishFragment();
        k8 k8Var = h8Var.f37438x;
        this.f36386a.V7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
