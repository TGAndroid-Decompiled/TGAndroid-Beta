package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class fa0 {
    public final org.telegram.ui.ActionBar.o2 f28364a;
    public final ka0 f28365b;

    public fa0(ka0 ka0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f28365b = ka0Var;
        this.f28364a = o2Var;
    }

    public final void a(boolean z10) {
        ka0 ka0Var = this.f28365b;
        boolean z11 = false;
        if (ka0Var.getNeededLayoutManager() != ka0Var.getCurrentLayoutManager() && ka0Var.a()) {
            if (ka0Var.f29999f.H0 > 0) {
                ka0Var.J = true;
                ka0Var.o(false);
                return;
            }
            ka0Var.f29996b.setLayoutManager(ka0Var.getNeededLayoutManager());
        }
        if (z10 && !ka0Var.a()) {
            z10 = false;
        }
        if (!z10 || ka0Var.f29999f.K() > 0) {
            z11 = z10;
        }
        ka0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f28365b.l(z10);
    }

    public final void c() {
        long j10;
        ka0 ka0Var = this.f28365b;
        rp rpVar = ka0Var.F;
        if (ka0Var.f29996b.getLayoutManager() != ka0Var.d && ka0Var.E) {
            AndroidUtilities.cancelRunOnUIThread(rpVar);
            if (this.f28364a.getFragmentBeginToShow()) {
                j10 = 0;
            } else {
                j10 = 100;
            }
            AndroidUtilities.runOnUIThread(rpVar, j10);
        }
    }
}
