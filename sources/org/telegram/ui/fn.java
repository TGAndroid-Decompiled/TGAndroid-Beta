package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fn extends af.f {
    public final org.telegram.ui.Cells.t1 d;
    public final jn e;

    public fn(jn jnVar, org.telegram.ui.Cells.t1 t1Var) {
        this.e = jnVar;
        this.d = t1Var;
    }

    @Override
    public final void c(boolean z4) {
        if (!z4) {
            AndroidUtilities.runOnUIThread(new wj(this.e.f35381a, 8), 250L);
        }
    }

    @Override
    public final void d() {
        jn jnVar = this.e;
        xn xnVar = jnVar.f35381a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        xnVar.f40191tb = t1Var.getMessageObject().getId();
        xn xnVar2 = jnVar.f35381a;
        xnVar2.f40204ub = 2;
        xnVar2.f40217vb = null;
        t1Var.invalidate();
    }
}
