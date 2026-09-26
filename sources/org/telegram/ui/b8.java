package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class b8 implements MessagesStorage.BooleanCallback {
    public final wn f32346a;
    public final c8 f32347b;

    public b8(c8 c8Var, wn wnVar) {
        this.f32347b = c8Var;
        this.f32346a = wnVar;
    }

    @Override
    public final void run(boolean z10) {
        e8 e8Var = this.f32347b.f32593b;
        e8Var.f33295x.finishFragment();
        h8 h8Var = e8Var.f33295x;
        this.f32346a.S7(h8Var.P, h8Var.Q + 86400, z10);
    }
}
