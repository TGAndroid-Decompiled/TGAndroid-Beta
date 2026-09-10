package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ln extends nf.e {
    public final org.telegram.ui.Cells.t1 d;
    public final pn e;

    public ln(pn pnVar, org.telegram.ui.Cells.t1 t1Var) {
        this.e = pnVar;
        this.d = t1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new ck(this.e.f35881a, 8), 250L);
        }
    }

    @Override
    public final void d() {
        pn pnVar = this.e;
        eo eoVar = pnVar.f35881a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        eoVar.f32540wb = t1Var.getMessageObject().getId();
        eo eoVar2 = pnVar.f35881a;
        eoVar2.f32553xb = 2;
        eoVar2.f32565yb = null;
        t1Var.invalidate();
    }
}
