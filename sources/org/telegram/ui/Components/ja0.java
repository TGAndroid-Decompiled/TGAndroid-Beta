package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ja0 {
    public final org.telegram.ui.ActionBar.n2 f27422a;
    public final oa0 f27423b;

    public ja0(oa0 oa0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f27423b = oa0Var;
        this.f27422a = n2Var;
    }

    public final void a(boolean z10) {
        oa0 oa0Var = this.f27423b;
        boolean z11 = false;
        if (oa0Var.getNeededLayoutManager() != oa0Var.getCurrentLayoutManager() && oa0Var.a()) {
            if (oa0Var.f29022f.L0 > 0) {
                oa0Var.N = true;
                oa0Var.o(false);
                return;
            }
            oa0Var.f29019b.setLayoutManager(oa0Var.getNeededLayoutManager());
        }
        if (z10 && !oa0Var.a()) {
            z10 = false;
        }
        if (!z10 || oa0Var.f29022f.K() > 0) {
            z11 = z10;
        }
        oa0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f27423b.l(z10);
    }

    public final void c() {
        long j3;
        oa0 oa0Var = this.f27423b;
        wp wpVar = oa0Var.J;
        if (oa0Var.f29019b.getLayoutManager() != oa0Var.d && oa0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(wpVar);
            if (this.f27422a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(wpVar, j3);
        }
    }
}
