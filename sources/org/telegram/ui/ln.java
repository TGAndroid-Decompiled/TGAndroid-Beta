package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ln extends of.e {
    public final org.telegram.ui.Cells.u1 d;
    public final pn f39784e;

    public ln(pn pnVar, org.telegram.ui.Cells.u1 u1Var) {
        this.f39784e = pnVar;
        this.d = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new gk(this.f39784e.f41000a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        pn pnVar = this.f39784e;
        eo eoVar = pnVar.f41000a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        eoVar.f37480wb = u1Var.getMessageObject().getId();
        eo eoVar2 = pnVar.f41000a;
        eoVar2.f37494xb = 2;
        eoVar2.f37506yb = null;
        u1Var.invalidate();
    }
}
