package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class cb0 {
    public final org.telegram.ui.ActionBar.r2 f27118a;
    public final hb0 f27119b;

    public cb0(hb0 hb0Var, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f27119b = hb0Var;
        this.f27118a = r2Var;
    }

    public final void a(boolean z10) {
        hb0 hb0Var = this.f27119b;
        boolean z11 = false;
        if (hb0Var.getNeededLayoutManager() != hb0Var.getCurrentLayoutManager() && hb0Var.a()) {
            if (hb0Var.f28943f.M0 > 0) {
                hb0Var.N = true;
                hb0Var.o(false);
                return;
            }
            hb0Var.f28941b.setLayoutManager(hb0Var.getNeededLayoutManager());
        }
        if (z10 && !hb0Var.a()) {
            z10 = false;
        }
        if (!z10 || hb0Var.f28943f.K() > 0) {
            z11 = z10;
        }
        hb0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f27119b.l(z10);
    }

    public final void c() {
        long j10;
        hb0 hb0Var = this.f27119b;
        xa0 xa0Var = hb0Var.J;
        if (hb0Var.f28941b.getLayoutManager() != hb0Var.d && hb0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(xa0Var);
            if (this.f27118a.getFragmentBeginToShow()) {
                j10 = 0;
            } else {
                j10 = 100;
            }
            AndroidUtilities.runOnUIThread(xa0Var, j10);
        }
    }
}
