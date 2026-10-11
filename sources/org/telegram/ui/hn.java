package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hn extends of.e {
    public final org.telegram.ui.Cells.u1 d;
    public final ln f38482e;

    public hn(ln lnVar, org.telegram.ui.Cells.u1 u1Var) {
        this.f38482e = lnVar;
        this.d = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new ck(this.f38482e.f39701a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        ln lnVar = this.f38482e;
        zn znVar = lnVar.f39701a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        znVar.f44986wb = u1Var.getMessageObject().getId();
        zn znVar2 = lnVar.f39701a;
        znVar2.f45000xb = 2;
        znVar2.f45012yb = null;
        u1Var.invalidate();
    }
}
