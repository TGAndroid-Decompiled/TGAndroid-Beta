package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wa0 {
    public final org.telegram.ui.ActionBar.m2 f29892a;
    public final bb0 f29893b;

    public wa0(bb0 bb0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f29893b = bb0Var;
        this.f29892a = m2Var;
    }

    public final void a(boolean z10) {
        bb0 bb0Var = this.f29893b;
        boolean z11 = false;
        if (bb0Var.getNeededLayoutManager() != bb0Var.getCurrentLayoutManager() && bb0Var.a()) {
            if (bb0Var.f22937f.M0 > 0) {
                bb0Var.N = true;
                bb0Var.o(false);
                return;
            }
            bb0Var.f22935b.setLayoutManager(bb0Var.getNeededLayoutManager());
        }
        if (z10 && !bb0Var.a()) {
            z10 = false;
        }
        if (!z10 || bb0Var.f22937f.K() > 0) {
            z11 = z10;
        }
        bb0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f29893b.l(z10);
    }

    public final void c() {
        long j3;
        bb0 bb0Var = this.f29893b;
        zp zpVar = bb0Var.J;
        if (bb0Var.f22935b.getLayoutManager() != bb0Var.d && bb0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(zpVar);
            if (this.f29892a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(zpVar, j3);
        }
    }
}
