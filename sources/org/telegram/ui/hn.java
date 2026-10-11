package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hn extends of.e {
    public final org.telegram.ui.Cells.u1 d;
    public final ln f38516e;

    public hn(ln lnVar, org.telegram.ui.Cells.u1 u1Var) {
        this.f38516e = lnVar;
        this.d = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new ck(this.f38516e.f39735a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        ln lnVar = this.f38516e;
        zn znVar = lnVar.f39735a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        znVar.f45020wb = u1Var.getMessageObject().getId();
        zn znVar2 = lnVar.f39735a;
        znVar2.f45034xb = 2;
        znVar2.f45046yb = null;
        u1Var.invalidate();
    }
}
