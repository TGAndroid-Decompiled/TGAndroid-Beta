package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dn extends qf.c {
    public final org.telegram.ui.Cells.s1 d;
    public final hn e;

    public dn(hn hnVar, org.telegram.ui.Cells.s1 s1Var) {
        this.e = hnVar;
        this.d = s1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new wh(this.e.f39938a, 11), 250L);
        }
    }

    @Override
    public final void d() {
        hn hnVar = this.e;
        wn wnVar = hnVar.f39938a;
        org.telegram.ui.Cells.s1 s1Var = this.d;
        wnVar.Wb = s1Var.getMessageObject().getId();
        wn wnVar2 = hnVar.f39938a;
        wnVar2.Xb = 2;
        wnVar2.Yb = null;
        s1Var.invalidate();
    }
}
