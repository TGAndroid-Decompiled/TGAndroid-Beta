package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class h8 implements MessagesStorage.BooleanCallback {
    public final wn f39816a;
    public final i8 f39817b;

    public h8(i8 i8Var, wn wnVar) {
        this.f39817b = i8Var;
        this.f39816a = wnVar;
    }

    @Override
    public final void run(boolean z10) {
        k8 k8Var = this.f39817b.f40064b;
        k8Var.f40685x.finishFragment();
        n8 n8Var = k8Var.f40685x;
        this.f39816a.b8(n8Var.P, n8Var.Q + 86400, z10);
    }
}
