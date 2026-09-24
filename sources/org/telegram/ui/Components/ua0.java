package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ua0 {
    public final org.telegram.ui.ActionBar.m2 f28751a;
    public final za0 f28752b;

    public ua0(za0 za0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f28752b = za0Var;
        this.f28751a = m2Var;
    }

    public final void a(boolean z10) {
        za0 za0Var = this.f28752b;
        boolean z11 = false;
        if (za0Var.getNeededLayoutManager() != za0Var.getCurrentLayoutManager() && za0Var.a()) {
            if (za0Var.f30816f.M0 > 0) {
                za0Var.N = true;
                za0Var.o(false);
                return;
            }
            za0Var.f30814b.setLayoutManager(za0Var.getNeededLayoutManager());
        }
        if (z10 && !za0Var.a()) {
            z10 = false;
        }
        if (!z10 || za0Var.f30816f.K() > 0) {
            z11 = z10;
        }
        za0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f28752b.l(z10);
    }

    public final void c() {
        long j3;
        za0 za0Var = this.f28752b;
        yp ypVar = za0Var.J;
        if (za0Var.f30814b.getLayoutManager() != za0Var.d && za0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(ypVar);
            if (this.f28751a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(ypVar, j3);
        }
    }
}
