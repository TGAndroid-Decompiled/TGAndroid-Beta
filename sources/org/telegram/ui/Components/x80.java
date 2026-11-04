package org.telegram.ui.Components;
public final class x80 {
    public final org.telegram.ui.ActionBar.d2 f40269a;
    public final c90 f40270b;

    public x80(c90 c90Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f40270b = c90Var;
        this.f40269a = d2Var;
    }

    public final void a(boolean z10) {
        c90 c90Var = this.f40270b;
        boolean z11 = false;
        if (c90Var.getNeededLayoutManager() != c90Var.getCurrentLayoutManager() && c90Var.a()) {
            if (c90Var.f32614f.N0 > 0) {
                c90Var.O = true;
                c90Var.o(false);
                return;
            }
            c90Var.f32611b.setLayoutManager(c90Var.getNeededLayoutManager());
        }
        if (z10 && !c90Var.a()) {
            z10 = false;
        }
        if (!z10 || c90Var.f32614f.K() > 0) {
            z11 = z10;
        }
        c90Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f40270b.l(z10);
    }

    public final void c() {
        long j10;
        c90 c90Var = this.f40270b;
        gp gpVar = c90Var.K;
        if (c90Var.f32611b.getLayoutManager() != c90Var.d && c90Var.J) {
            org.telegram.messenger.g0.r(gpVar);
            if (this.f40269a.getFragmentBeginToShow()) {
                j10 = 0;
            } else {
                j10 = 100;
            }
            org.telegram.messenger.g0.i3(gpVar, j10);
        }
    }
}
