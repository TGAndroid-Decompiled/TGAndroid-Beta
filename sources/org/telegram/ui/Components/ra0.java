package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ra0 {
    public final org.telegram.ui.ActionBar.n2 f27868a;
    public final wa0 f27869b;

    public ra0(wa0 wa0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f27869b = wa0Var;
        this.f27868a = n2Var;
    }

    public final void a(boolean z10) {
        wa0 wa0Var = this.f27869b;
        boolean z11 = false;
        if (wa0Var.getNeededLayoutManager() != wa0Var.getCurrentLayoutManager() && wa0Var.a()) {
            if (wa0Var.f30006f.M0 > 0) {
                wa0Var.N = true;
                wa0Var.o(false);
                return;
            }
            wa0Var.f30004b.setLayoutManager(wa0Var.getNeededLayoutManager());
        }
        if (z10 && !wa0Var.a()) {
            z10 = false;
        }
        if (!z10 || wa0Var.f30006f.K() > 0) {
            z11 = z10;
        }
        wa0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f27869b.l(z10);
    }

    public final void c() {
        long j3;
        wa0 wa0Var = this.f27869b;
        xp xpVar = wa0Var.J;
        if (wa0Var.f30004b.getLayoutManager() != wa0Var.d && wa0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(xpVar);
            if (this.f27868a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(xpVar, j3);
        }
    }
}
