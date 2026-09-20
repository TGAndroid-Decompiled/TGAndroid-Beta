package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class qa0 {
    public final org.telegram.ui.ActionBar.n2 f27556a;
    public final va0 f27557b;

    public qa0(va0 va0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f27557b = va0Var;
        this.f27556a = n2Var;
    }

    public final void a(boolean z10) {
        va0 va0Var = this.f27557b;
        boolean z11 = false;
        if (va0Var.getNeededLayoutManager() != va0Var.getCurrentLayoutManager() && va0Var.a()) {
            if (va0Var.f29048f.M0 > 0) {
                va0Var.N = true;
                va0Var.o(false);
                return;
            }
            va0Var.f29046b.setLayoutManager(va0Var.getNeededLayoutManager());
        }
        if (z10 && !va0Var.a()) {
            z10 = false;
        }
        if (!z10 || va0Var.f29048f.K() > 0) {
            z11 = z10;
        }
        va0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f27557b.l(z10);
    }

    public final void c() {
        long j3;
        va0 va0Var = this.f27557b;
        xp xpVar = va0Var.J;
        if (va0Var.f29046b.getLayoutManager() != va0Var.d && va0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(xpVar);
            if (this.f27556a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(xpVar, j3);
        }
    }
}
