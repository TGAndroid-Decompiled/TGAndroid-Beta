package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class en extends nf.e {
    public final org.telegram.ui.Cells.u1 d;
    public final in e;

    public en(in inVar, org.telegram.ui.Cells.u1 u1Var) {
        this.e = inVar;
        this.d = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new xj(this.e.f34558a, 8), 250L);
        }
    }

    @Override
    public final void d() {
        in inVar = this.e;
        wn wnVar = inVar.f34558a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        wnVar.f39680vb = u1Var.getMessageObject().getId();
        wn wnVar2 = inVar.f34558a;
        wnVar2.f39694wb = 2;
        wnVar2.f39707xb = null;
        u1Var.invalidate();
    }
}
