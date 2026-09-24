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
            AndroidUtilities.runOnUIThread(new xj(this.e.f34543a, 8), 250L);
        }
    }

    @Override
    public final void d() {
        in inVar = this.e;
        wn wnVar = inVar.f34543a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        wnVar.f39664vb = u1Var.getMessageObject().getId();
        wn wnVar2 = inVar.f34543a;
        wnVar2.f39678wb = 2;
        wnVar2.f39691xb = null;
        u1Var.invalidate();
    }
}
