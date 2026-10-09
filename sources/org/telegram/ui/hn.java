package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hn extends of.e {
    public final org.telegram.ui.Cells.u1 d;
    public final ln f38379e;

    public hn(ln lnVar, org.telegram.ui.Cells.u1 u1Var) {
        this.f38379e = lnVar;
        this.d = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new ck(this.f38379e.f39634a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        ln lnVar = this.f38379e;
        zn znVar = lnVar.f39634a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        znVar.f44985wb = u1Var.getMessageObject().getId();
        zn znVar2 = lnVar.f39634a;
        znVar2.f44999xb = 2;
        znVar2.f45011yb = null;
        u1Var.invalidate();
    }
}
