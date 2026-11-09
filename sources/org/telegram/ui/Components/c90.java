package org.telegram.ui.Components;
public final class c90 {
    public final org.telegram.ui.ActionBar.f2 f32596a;
    public final h90 f32597b;

    public c90(h90 h90Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f32597b = h90Var;
        this.f32596a = f2Var;
    }

    public final void a(boolean z9) {
        h90 h90Var = this.f32597b;
        boolean z10 = false;
        if (h90Var.getNeededLayoutManager() != h90Var.getCurrentLayoutManager() && h90Var.a()) {
            if (h90Var.f34250f.M0 > 0) {
                h90Var.N = true;
                h90Var.o(false);
                return;
            }
            h90Var.f34247b.setLayoutManager(h90Var.getNeededLayoutManager());
        }
        if (z9 && !h90Var.a()) {
            z9 = false;
        }
        if (!z9 || h90Var.f34250f.K() > 0) {
            z10 = z9;
        }
        h90Var.o(z10);
    }

    public final void b(boolean z9) {
        this.f32597b.l(z9);
    }

    public final void c() {
        long j3;
        h90 h90Var = this.f32597b;
        gp gpVar = h90Var.J;
        if (h90Var.f34247b.getLayoutManager() != h90Var.d && h90Var.I) {
            org.telegram.messenger.g0.r(gpVar);
            if (this.f32596a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            org.telegram.messenger.g0.i3(gpVar, j3);
        }
    }
}
