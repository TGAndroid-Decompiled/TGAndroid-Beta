package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class db0 {
    public final org.telegram.ui.ActionBar.n2 f25436a;
    public final ib0 f25437b;

    public db0(ib0 ib0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f25437b = ib0Var;
        this.f25436a = n2Var;
    }

    public final void a(boolean z10) {
        ib0 ib0Var = this.f25437b;
        boolean z11 = false;
        if (ib0Var.getNeededLayoutManager() != ib0Var.getCurrentLayoutManager() && ib0Var.a()) {
            if (ib0Var.f27223f.M0 > 0) {
                ib0Var.N = true;
                ib0Var.o(false);
                return;
            }
            ib0Var.f27221b.setLayoutManager(ib0Var.getNeededLayoutManager());
        }
        if (z10 && !ib0Var.a()) {
            z10 = false;
        }
        if (!z10 || ib0Var.f27223f.K() > 0) {
            z11 = z10;
        }
        ib0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f25437b.l(z10);
    }

    public final void c() {
        long j10;
        ib0 ib0Var = this.f25437b;
        hq hqVar = ib0Var.J;
        if (ib0Var.f27221b.getLayoutManager() != ib0Var.d && ib0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(hqVar);
            if (this.f25436a.getFragmentBeginToShow()) {
                j10 = 0;
            } else {
                j10 = 100;
            }
            AndroidUtilities.runOnUIThread(hqVar, j10);
        }
    }
}
