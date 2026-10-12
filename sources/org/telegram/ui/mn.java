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
            AndroidUtilities.runOnUIThread(new gk(this.e.f39497a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        qn qnVar = this.e;
        fo foVar = qnVar.f39497a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        foVar.f36157wb = u1Var.getMessageObject().getId();
        fo foVar2 = qnVar.f39497a;
        foVar2.f36171xb = 2;
        foVar2.f36184yb = null;
        u1Var.invalidate();
    }
}
