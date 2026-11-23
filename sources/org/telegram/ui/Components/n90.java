package org.telegram.ui.Components;
public final class n90 {
    public final org.telegram.ui.ActionBar.g2 f37732a;
    public final s90 f37733b;

    public n90(s90 s90Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f37733b = s90Var;
        this.f37732a = g2Var;
    }

    public final void a(boolean z10) {
        s90 s90Var = this.f37733b;
        boolean z11 = false;
        if (s90Var.getNeededLayoutManager() != s90Var.getCurrentLayoutManager() && s90Var.a()) {
            if (s90Var.f39538f.N0 > 0) {
                s90Var.O = true;
                s90Var.o(false);
                return;
            }
            s90Var.f39535b.setLayoutManager(s90Var.getNeededLayoutManager());
        }
        if (z10 && !s90Var.a()) {
            z10 = false;
        }
        if (!z10 || s90Var.f39538f.K() > 0) {
            z11 = z10;
        }
        s90Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f37733b.l(z10);
    }

    public final void c() {
        long j3;
        s90 s90Var = this.f37733b;
        lo loVar = s90Var.K;
        if (s90Var.f39535b.getLayoutManager() != s90Var.d && s90Var.J) {
            org.telegram.messenger.g0.r(loVar);
            if (this.f37732a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            org.telegram.messenger.g0.h3(loVar, j3);
        }
    }
}
