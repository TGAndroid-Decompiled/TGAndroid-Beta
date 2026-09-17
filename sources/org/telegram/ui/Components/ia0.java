package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ia0 {
    public final org.telegram.ui.ActionBar.o2 f24917a;
    public final na0 f24918b;

    public ia0(na0 na0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f24918b = na0Var;
        this.f24917a = o2Var;
    }

    public final void a(boolean z10) {
        na0 na0Var = this.f24918b;
        boolean z11 = false;
        if (na0Var.getNeededLayoutManager() != na0Var.getCurrentLayoutManager() && na0Var.a()) {
            if (na0Var.f26427f.L0 > 0) {
                na0Var.N = true;
                na0Var.o(false);
                return;
            }
            na0Var.f26425b.setLayoutManager(na0Var.getNeededLayoutManager());
        }
        if (z10 && !na0Var.a()) {
            z10 = false;
        }
        if (!z10 || na0Var.f26427f.K() > 0) {
            z11 = z10;
        }
        na0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f24918b.l(z10);
    }

    public final void c() {
        long j3;
        na0 na0Var = this.f24918b;
        xp xpVar = na0Var.J;
        if (na0Var.f26425b.getLayoutManager() != na0Var.d && na0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(xpVar);
            if (this.f24917a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(xpVar, j3);
        }
    }
}
