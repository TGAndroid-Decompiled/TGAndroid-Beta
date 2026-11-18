package org.telegram.ui.Components;
public final class o90 {
    public final org.telegram.ui.ActionBar.h2 f38035a;
    public final t90 f38036b;

    public o90(t90 t90Var, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f38036b = t90Var;
        this.f38035a = h2Var;
    }

    public final void a(boolean z10) {
        t90 t90Var = this.f38036b;
        boolean z11 = false;
        if (t90Var.getNeededLayoutManager() != t90Var.getCurrentLayoutManager() && t90Var.a()) {
            if (t90Var.f39949f.N0 > 0) {
                t90Var.O = true;
                t90Var.o(false);
                return;
            }
            t90Var.f39946b.setLayoutManager(t90Var.getNeededLayoutManager());
        }
        if (z10 && !t90Var.a()) {
            z10 = false;
        }
        if (!z10 || t90Var.f39949f.K() > 0) {
            z11 = z10;
        }
        t90Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f38036b.l(z10);
    }

    public final void c() {
        long j3;
        t90 t90Var = this.f38036b;
        mo moVar = t90Var.K;
        if (t90Var.f39946b.getLayoutManager() != t90Var.d && t90Var.J) {
            org.telegram.messenger.g0.r(moVar);
            if (this.f38035a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            org.telegram.messenger.g0.h3(moVar, j3);
        }
    }
}
