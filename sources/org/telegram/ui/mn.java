package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mn extends pf.c {
    public final org.telegram.ui.Cells.u1 d;
    public final qn e;

    public mn(qn qnVar, org.telegram.ui.Cells.u1 u1Var) {
        this.e = qnVar;
        this.d = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new gk(this.e.f39190a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        qn qnVar = this.e;
        fo foVar = qnVar.f39190a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        foVar.f35858wb = u1Var.getMessageObject().getId();
        fo foVar2 = qnVar.f39190a;
        foVar2.f35872xb = 2;
        foVar2.f35885yb = null;
        u1Var.invalidate();
    }
}
