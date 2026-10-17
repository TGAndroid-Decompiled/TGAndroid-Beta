package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class db0 {
    public final org.telegram.ui.ActionBar.n2 f25555a;
    public final ib0 f25556b;

    public db0(ib0 ib0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f25556b = ib0Var;
        this.f25555a = n2Var;
    }

    public final void a(boolean z10) {
        ib0 ib0Var = this.f25556b;
        boolean z11 = false;
        if (ib0Var.getNeededLayoutManager() != ib0Var.getCurrentLayoutManager() && ib0Var.a()) {
            if (ib0Var.f27171f.M0 > 0) {
                ib0Var.N = true;
                ib0Var.o(false);
                return;
            }
            ib0Var.f27169b.setLayoutManager(ib0Var.getNeededLayoutManager());
        }
        if (z10 && !ib0Var.a()) {
            z10 = false;
        }
        if (!z10 || ib0Var.f27171f.K() > 0) {
            z11 = z10;
        }
        ib0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f25556b.l(z10);
    }

    public final void c() {
        long j10;
        ib0 ib0Var = this.f25556b;
        hq hqVar = ib0Var.J;
        if (ib0Var.f27169b.getLayoutManager() != ib0Var.d && ib0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(hqVar);
            if (this.f25555a.getFragmentBeginToShow()) {
                j10 = 0;
            } else {
                j10 = 100;
            }
            AndroidUtilities.runOnUIThread(hqVar, j10);
        }
    }
}
