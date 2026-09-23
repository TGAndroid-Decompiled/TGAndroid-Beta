package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fn extends nf.e {
    public final org.telegram.ui.Cells.t1 d;
    public final jn e;

    public fn(jn jnVar, org.telegram.ui.Cells.t1 t1Var) {
        this.e = jnVar;
        this.d = t1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new xj(this.e.f34487a, 8), 250L);
        }
    }

    @Override
    public final void d() {
        jn jnVar = this.e;
        xn xnVar = jnVar.f34487a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        xnVar.f39580vb = t1Var.getMessageObject().getId();
        xn xnVar2 = jnVar.f34487a;
        xnVar2.f39594wb = 2;
        xnVar2.f39607xb = null;
        t1Var.invalidate();
    }
}
