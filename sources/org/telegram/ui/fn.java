package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fn extends nf.e {
    public final org.telegram.ui.Cells.u1 d;
    public final jn e;

    public fn(jn jnVar, org.telegram.ui.Cells.u1 u1Var) {
        this.e = jnVar;
        this.d = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new zj(this.e.f34766a, 8), 250L);
        }
    }

    @Override
    public final void d() {
        jn jnVar = this.e;
        xn xnVar = jnVar.f34766a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        xnVar.f39961vb = u1Var.getMessageObject().getId();
        xn xnVar2 = jnVar.f34766a;
        xnVar2.f39975wb = 2;
        xnVar2.f39988xb = null;
        u1Var.invalidate();
    }
}
