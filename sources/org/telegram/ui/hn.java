package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hn extends nf.e {
    public final org.telegram.ui.Cells.u1 d;
    public final ln e;

    public hn(ln lnVar, org.telegram.ui.Cells.u1 u1Var) {
        this.e = lnVar;
        this.d = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new ak(this.e.f35505a, 8), 250L);
        }
    }

    @Override
    public final void d() {
        ln lnVar = this.e;
        zn znVar = lnVar.f35505a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        znVar.f40535vb = u1Var.getMessageObject().getId();
        zn znVar2 = lnVar.f35505a;
        znVar2.f40549wb = 2;
        znVar2.f40562xb = null;
        u1Var.invalidate();
    }
}
