package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bn extends qf.c {
    public final org.telegram.ui.Cells.s1 d;
    public final fn e;

    public bn(fn fnVar, org.telegram.ui.Cells.s1 s1Var) {
        this.e = fnVar;
        this.d = s1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new uj(this.e.f39423a, 10), 250L);
        }
    }

    @Override
    public final void d() {
        fn fnVar = this.e;
        un unVar = fnVar.f39423a;
        org.telegram.ui.Cells.s1 s1Var = this.d;
        unVar.Sb = s1Var.getMessageObject().getId();
        un unVar2 = fnVar.f39423a;
        unVar2.Tb = 2;
        unVar2.Ub = null;
        s1Var.invalidate();
    }
}
