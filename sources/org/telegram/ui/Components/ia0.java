package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ia0 {
    public final org.telegram.ui.ActionBar.n2 f24992a;
    public final na0 f24993b;

    public ia0(na0 na0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f24993b = na0Var;
        this.f24992a = n2Var;
    }

    public final void a(boolean z10) {
        na0 na0Var = this.f24993b;
        boolean z11 = false;
        if (na0Var.getNeededLayoutManager() != na0Var.getCurrentLayoutManager() && na0Var.a()) {
            if (na0Var.f26424f.M0 > 0) {
                na0Var.N = true;
                na0Var.o(false);
                return;
            }
            na0Var.f26422b.setLayoutManager(na0Var.getNeededLayoutManager());
        }
        if (z10 && !na0Var.a()) {
            z10 = false;
        }
        if (!z10 || na0Var.f26424f.K() > 0) {
            z11 = z10;
        }
        na0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f24993b.l(z10);
    }

    public final void c() {
        long j3;
        na0 na0Var = this.f24993b;
        xp xpVar = na0Var.J;
        if (na0Var.f26422b.getLayoutManager() != na0Var.d && na0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(xpVar);
            if (this.f24992a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(xpVar, j3);
        }
    }
}
