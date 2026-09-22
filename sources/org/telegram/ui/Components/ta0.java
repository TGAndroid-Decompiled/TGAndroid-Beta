package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ta0 {
    public final org.telegram.ui.ActionBar.n2 f28442a;
    public final ya0 f28443b;

    public ta0(ya0 ya0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f28443b = ya0Var;
        this.f28442a = n2Var;
    }

    public final void a(boolean z10) {
        ya0 ya0Var = this.f28443b;
        boolean z11 = false;
        if (ya0Var.getNeededLayoutManager() != ya0Var.getCurrentLayoutManager() && ya0Var.a()) {
            if (ya0Var.f30618f.M0 > 0) {
                ya0Var.N = true;
                ya0Var.o(false);
                return;
            }
            ya0Var.f30616b.setLayoutManager(ya0Var.getNeededLayoutManager());
        }
        if (z10 && !ya0Var.a()) {
            z10 = false;
        }
        if (!z10 || ya0Var.f30618f.K() > 0) {
            z11 = z10;
        }
        ya0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f28443b.l(z10);
    }

    public final void c() {
        long j3;
        ya0 ya0Var = this.f28443b;
        xp xpVar = ya0Var.J;
        if (ya0Var.f30616b.getLayoutManager() != ya0Var.d && ya0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(xpVar);
            if (this.f28442a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(xpVar, j3);
        }
    }
}
