package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gn extends nf.e {
    public final org.telegram.ui.Cells.u1 d;
    public final kn f36676e;

    public gn(kn knVar, org.telegram.ui.Cells.u1 u1Var) {
        this.f36676e = knVar;
        this.d = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new dn(this.f36676e.f38003a, 5), 250L);
        }
    }

    @Override
    public final void d() {
        kn knVar = this.f36676e;
        yn ynVar = knVar.f38003a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        ynVar.f43511tb = u1Var.getMessageObject().getId();
        yn ynVar2 = knVar.f38003a;
        ynVar2.f43524ub = 2;
        ynVar2.f43536vb = null;
        u1Var.invalidate();
    }
}
