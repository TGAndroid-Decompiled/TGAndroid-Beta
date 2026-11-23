package org.telegram.ui.Components;
public final class q90 {
    public final org.telegram.ui.ActionBar.g2 f38847a;
    public final v90 f38848b;

    public q90(v90 v90Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f38848b = v90Var;
        this.f38847a = g2Var;
    }

    public final void a(boolean z10) {
        v90 v90Var = this.f38848b;
        boolean z11 = false;
        if (v90Var.getNeededLayoutManager() != v90Var.getCurrentLayoutManager() && v90Var.a()) {
            if (v90Var.f40747f.N0 > 0) {
                v90Var.O = true;
                v90Var.o(false);
                return;
            }
            v90Var.f40744b.setLayoutManager(v90Var.getNeededLayoutManager());
        }
        if (z10 && !v90Var.a()) {
            z10 = false;
        }
        if (!z10 || v90Var.f40747f.K() > 0) {
            z11 = z10;
        }
        v90Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f38848b.l(z10);
    }

    public final void c() {
        long j3;
        v90 v90Var = this.f38848b;
        oo ooVar = v90Var.K;
        if (v90Var.f40744b.getLayoutManager() != v90Var.d && v90Var.J) {
            org.telegram.messenger.g0.r(ooVar);
            if (this.f38847a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            org.telegram.messenger.g0.h3(ooVar, j3);
        }
    }
}
