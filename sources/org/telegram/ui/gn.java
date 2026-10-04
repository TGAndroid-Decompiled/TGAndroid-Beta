package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gn extends nf.e {
    public final org.telegram.ui.Cells.u1 d;
    public final kn f36681e;

    public gn(kn knVar, org.telegram.ui.Cells.u1 u1Var) {
        this.f36681e = knVar;
        this.d = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new dn(this.f36681e.f38008a, 5), 250L);
        }
    }

    @Override
    public final void d() {
        kn knVar = this.f36681e;
        yn ynVar = knVar.f38008a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        ynVar.f43518tb = u1Var.getMessageObject().getId();
        yn ynVar2 = knVar.f38008a;
        ynVar2.f43531ub = 2;
        ynVar2.f43543vb = null;
        u1Var.invalidate();
    }
}
