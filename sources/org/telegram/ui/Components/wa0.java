package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wa0 {
    public final org.telegram.ui.ActionBar.n2 f32506a;
    public final bb0 f32507b;

    public wa0(bb0 bb0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f32507b = bb0Var;
        this.f32506a = n2Var;
    }

    public final void a(boolean z10) {
        bb0 bb0Var = this.f32507b;
        boolean z11 = false;
        if (bb0Var.getNeededLayoutManager() != bb0Var.getCurrentLayoutManager() && bb0Var.a()) {
            if (bb0Var.f24910f.M0 > 0) {
                bb0Var.N = true;
                bb0Var.o(false);
                return;
            }
            bb0Var.f24907b.setLayoutManager(bb0Var.getNeededLayoutManager());
        }
        if (z10 && !bb0Var.a()) {
            z10 = false;
        }
        if (!z10 || bb0Var.f24910f.K() > 0) {
            z11 = z10;
        }
        bb0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f32507b.l(z10);
    }

    public final void c() {
        long j3;
        bb0 bb0Var = this.f32507b;
        aq aqVar = bb0Var.J;
        if (bb0Var.f24907b.getLayoutManager() != bb0Var.d && bb0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(aqVar);
            if (this.f32506a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(aqVar, j3);
        }
    }
}
