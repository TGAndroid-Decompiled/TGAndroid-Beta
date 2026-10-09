package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class kb0 {
    public final org.telegram.ui.ActionBar.n2 f27927a;
    public final pb0 f27928b;

    public kb0(pb0 pb0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f27928b = pb0Var;
        this.f27927a = n2Var;
    }

    public final void a(boolean z10) {
        pb0 pb0Var = this.f27928b;
        boolean z11 = false;
        if (pb0Var.getNeededLayoutManager() != pb0Var.getCurrentLayoutManager() && pb0Var.a()) {
            if (pb0Var.f29830f.M0 > 0) {
                pb0Var.N = true;
                pb0Var.o(false);
                return;
            }
            pb0Var.f29827b.setLayoutManager(pb0Var.getNeededLayoutManager());
        }
        if (z10 && !pb0Var.a()) {
            z10 = false;
        }
        if (!z10 || pb0Var.f29830f.K() > 0) {
            z11 = z10;
        }
        pb0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f27928b.l(z10);
    }

    public final void c() {
        long j3;
        pb0 pb0Var = this.f27928b;
        nq nqVar = pb0Var.J;
        if (pb0Var.f29827b.getLayoutManager() != pb0Var.d && pb0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(nqVar);
            if (this.f27927a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(nqVar, j3);
        }
    }
}
