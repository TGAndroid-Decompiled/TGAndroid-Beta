package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ln extends of.e {
    public final org.telegram.ui.Cells.u1 d;
    public final pn f39781e;

    public ln(pn pnVar, org.telegram.ui.Cells.u1 u1Var) {
        this.f39781e = pnVar;
        this.d = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new gk(this.f39781e.f40998a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        pn pnVar = this.f39781e;
        eo eoVar = pnVar.f40998a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        eoVar.f37475wb = u1Var.getMessageObject().getId();
        eo eoVar2 = pnVar.f40998a;
        eoVar2.f37489xb = 2;
        eoVar2.f37501yb = null;
        u1Var.invalidate();
    }
}
