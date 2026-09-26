package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class va0 {
    public final org.telegram.ui.ActionBar.m2 f29053a;
    public final ab0 f29054b;

    public va0(ab0 ab0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f29054b = ab0Var;
        this.f29053a = m2Var;
    }

    public final void a(boolean z10) {
        ab0 ab0Var = this.f29054b;
        boolean z11 = false;
        if (ab0Var.getNeededLayoutManager() != ab0Var.getCurrentLayoutManager() && ab0Var.a()) {
            if (ab0Var.f22593f.M0 > 0) {
                ab0Var.N = true;
                ab0Var.o(false);
                return;
            }
            ab0Var.f22591b.setLayoutManager(ab0Var.getNeededLayoutManager());
        }
        if (z10 && !ab0Var.a()) {
            z10 = false;
        }
        if (!z10 || ab0Var.f22593f.K() > 0) {
            z11 = z10;
        }
        ab0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f29054b.l(z10);
    }

    public final void c() {
        long j3;
        ab0 ab0Var = this.f29054b;
        zp zpVar = ab0Var.J;
        if (ab0Var.f22591b.getLayoutManager() != ab0Var.d && ab0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(zpVar);
            if (this.f29053a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(zpVar, j3);
        }
    }
}
