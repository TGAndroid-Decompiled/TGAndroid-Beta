package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class h8 implements MessagesStorage.BooleanCallback {
    public final un f39929a;
    public final i8 f39930b;

    public h8(i8 i8Var, un unVar) {
        this.f39930b = i8Var;
        this.f39929a = unVar;
    }

    @Override
    public final void run(boolean z10) {
        k8 k8Var = this.f39930b.f40166b;
        k8Var.f40822x.finishFragment();
        n8 n8Var = k8Var.f40822x;
        this.f39929a.Z7(n8Var.P, n8Var.Q + 86400, z10);
    }
}
