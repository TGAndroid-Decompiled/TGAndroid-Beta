package org.telegram.ui.Components;
public final class b90 {
    public final org.telegram.ui.ActionBar.f2 f32083a;
    public final g90 f32084b;

    public b90(g90 g90Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f32084b = g90Var;
        this.f32083a = f2Var;
    }

    public final void a(boolean z9) {
        g90 g90Var = this.f32084b;
        boolean z10 = false;
        if (g90Var.getNeededLayoutManager() != g90Var.getCurrentLayoutManager() && g90Var.a()) {
            if (g90Var.f33863f.M0 > 0) {
                g90Var.N = true;
                g90Var.o(false);
                return;
            }
            g90Var.f33860b.setLayoutManager(g90Var.getNeededLayoutManager());
        }
        if (z9 && !g90Var.a()) {
            z9 = false;
        }
        if (!z9 || g90Var.f33863f.K() > 0) {
            z10 = z9;
        }
        g90Var.o(z10);
    }

    public final void b(boolean z9) {
        this.f32084b.l(z9);
    }

    public final void c() {
        long j3;
        g90 g90Var = this.f32084b;
        gp gpVar = g90Var.J;
        if (g90Var.f33860b.getLayoutManager() != g90Var.d && g90Var.I) {
            org.telegram.messenger.g0.r(gpVar);
            if (this.f32083a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            org.telegram.messenger.g0.i3(gpVar, j3);
        }
    }
}
