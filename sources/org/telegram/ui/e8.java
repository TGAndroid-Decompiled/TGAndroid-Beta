package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class e8 implements MessagesStorage.BooleanCallback {
    public final xn f33166a;
    public final f8 f33167b;

    public e8(f8 f8Var, xn xnVar) {
        this.f33167b = f8Var;
        this.f33166a = xnVar;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f33167b.f33452b;
        h8Var.f34159x.finishFragment();
        k8 k8Var = h8Var.f34159x;
        this.f33166a.S7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
