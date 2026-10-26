package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class h8 implements MessagesStorage.BooleanCallback {
    public final un f39932a;
    public final i8 f39933b;

    public h8(i8 i8Var, un unVar) {
        this.f39933b = i8Var;
        this.f39932a = unVar;
    }

    @Override
    public final void run(boolean z10) {
        k8 k8Var = this.f39933b.f40169b;
        k8Var.f40825x.finishFragment();
        n8 n8Var = k8Var.f40825x;
        this.f39932a.Z7(n8Var.P, n8Var.Q + 86400, z10);
    }
}
