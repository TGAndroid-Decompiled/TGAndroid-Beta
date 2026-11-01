package org.telegram.ui.Components;
public final class t90 {
    public final org.telegram.ui.ActionBar.k2 f30615a;
    public final y90 f30616b;

    public t90(y90 y90Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f30616b = y90Var;
        this.f30615a = k2Var;
    }

    public final void a(boolean z10) {
        y90 y90Var = this.f30616b;
        boolean z11 = false;
        if (y90Var.getNeededLayoutManager() != y90Var.getCurrentLayoutManager() && y90Var.a()) {
            if (y90Var.f32783f.M0 > 0) {
                y90Var.N = true;
                y90Var.o(false);
                return;
            }
            y90Var.f32781b.setLayoutManager(y90Var.getNeededLayoutManager());
        }
        if (z10 && !y90Var.a()) {
            z10 = false;
        }
        if (!z10 || y90Var.f32783f.K() > 0) {
            z11 = z10;
        }
        y90Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f30616b.l(z10);
    }

    public final void c() {
        long j10;
        y90 y90Var = this.f30616b;
        ho hoVar = y90Var.J;
        if (y90Var.f32781b.getLayoutManager() != y90Var.d && y90Var.I) {
            org.telegram.messenger.i0.r(hoVar);
            if (this.f30615a.getFragmentBeginToShow()) {
                j10 = 0;
            } else {
                j10 = 100;
            }
            org.telegram.messenger.i0.h3(hoVar, j10);
        }
    }
}
