package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hn extends ze.c {
    public final org.telegram.ui.Cells.s1 d;
    public final ln e;

    public hn(ln lnVar, org.telegram.ui.Cells.s1 s1Var) {
        this.e = lnVar;
        this.d = s1Var;
    }

    @Override
    public final void c(boolean z4) {
        if (!z4) {
            AndroidUtilities.runOnUIThread(new yj(this.e.f35808a, 8), 250L);
        }
    }

    @Override
    public final void d() {
        ln lnVar = this.e;
        zn znVar = lnVar.f35808a;
        org.telegram.ui.Cells.s1 s1Var = this.d;
        znVar.f40757tb = s1Var.getMessageObject().getId();
        zn znVar2 = lnVar.f35808a;
        znVar2.f40770ub = 2;
        znVar2.f40783vb = null;
        s1Var.invalidate();
    }
}
