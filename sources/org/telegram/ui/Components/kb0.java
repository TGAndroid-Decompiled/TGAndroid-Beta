package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class kb0 {
    public final org.telegram.ui.ActionBar.m2 f28020a;
    public final pb0 f28021b;

    public kb0(pb0 pb0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f28021b = pb0Var;
        this.f28020a = m2Var;
    }

    public final void a(boolean z10) {
        pb0 pb0Var = this.f28021b;
        boolean z11 = false;
        if (pb0Var.getNeededLayoutManager() != pb0Var.getCurrentLayoutManager() && pb0Var.a()) {
            if (pb0Var.f29832f.M0 > 0) {
                pb0Var.N = true;
                pb0Var.o(false);
                return;
            }
            pb0Var.f29829b.setLayoutManager(pb0Var.getNeededLayoutManager());
        }
        if (z10 && !pb0Var.a()) {
            z10 = false;
        }
        if (!z10 || pb0Var.f29832f.K() > 0) {
            z11 = z10;
        }
        pb0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f28021b.l(z10);
    }

    public final void c() {
        long j3;
        pb0 pb0Var = this.f28021b;
        nq nqVar = pb0Var.J;
        if (pb0Var.f29829b.getLayoutManager() != pb0Var.d && pb0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(nqVar);
            if (this.f28020a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(nqVar, j3);
        }
    }
}
