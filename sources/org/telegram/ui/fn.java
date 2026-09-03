package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fn extends af.f {
    public final org.telegram.ui.Cells.t1 d;
    public final jn f36819e;

    public fn(jn jnVar, org.telegram.ui.Cells.t1 t1Var) {
        this.f36819e = jnVar;
        this.d = t1Var;
    }

    @Override
    public final void c(boolean z4) {
        if (!z4) {
            AndroidUtilities.runOnUIThread(new wj(this.f36819e.f38085a, 8), 250L);
        }
    }

    @Override
    public final void d() {
        jn jnVar = this.f36819e;
        xn xnVar = jnVar.f38085a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        xnVar.f43338tb = t1Var.getMessageObject().getId();
        xn xnVar2 = jnVar.f38085a;
        xnVar2.f43351ub = 2;
        xnVar2.f43364vb = null;
        t1Var.invalidate();
    }
}
