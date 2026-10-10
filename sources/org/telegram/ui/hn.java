package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hn extends of.e {
    public final org.telegram.ui.Cells.u1 d;
    public final ln f38425e;

    public hn(ln lnVar, org.telegram.ui.Cells.u1 u1Var) {
        this.f38425e = lnVar;
        this.d = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new ck(this.f38425e.f39680a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        ln lnVar = this.f38425e;
        zn znVar = lnVar.f39680a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        znVar.f45031wb = u1Var.getMessageObject().getId();
        zn znVar2 = lnVar.f39680a;
        znVar2.f45045xb = 2;
        znVar2.f45057yb = null;
        u1Var.invalidate();
    }
}
