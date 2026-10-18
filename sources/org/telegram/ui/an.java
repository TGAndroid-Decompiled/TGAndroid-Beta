package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class an extends pf.c {
    public final org.telegram.ui.Cells.u1 d;
    public final en e;

    public an(en enVar, org.telegram.ui.Cells.u1 u1Var) {
        this.e = enVar;
        this.d = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new vj(this.e.f36573a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        en enVar = this.e;
        sn snVar = enVar.f36573a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        snVar.f41451wb = u1Var.getMessageObject().getId();
        sn snVar2 = enVar.f36573a;
        snVar2.f41465xb = 2;
        snVar2.f41478yb = null;
        u1Var.invalidate();
    }
}
