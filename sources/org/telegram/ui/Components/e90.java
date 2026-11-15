package org.telegram.ui.Components;
public final class e90 {
    public final org.telegram.ui.ActionBar.e2 f34249a;
    public final j90 f34250b;

    public e90(j90 j90Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f34250b = j90Var;
        this.f34249a = e2Var;
    }

    public final void a(boolean z10) {
        j90 j90Var = this.f34250b;
        boolean z11 = false;
        if (j90Var.getNeededLayoutManager() != j90Var.getCurrentLayoutManager() && j90Var.a()) {
            if (j90Var.f35923f.N0 > 0) {
                j90Var.O = true;
                j90Var.o(false);
                return;
            }
            j90Var.f35920b.setLayoutManager(j90Var.getNeededLayoutManager());
        }
        if (z10 && !j90Var.a()) {
            z10 = false;
        }
        if (!z10 || j90Var.f35923f.K() > 0) {
            z11 = z10;
        }
        j90Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f34250b.l(z10);
    }

    public final void c() {
        long j3;
        j90 j90Var = this.f34250b;
        fo foVar = j90Var.K;
        if (j90Var.f35920b.getLayoutManager() != j90Var.d && j90Var.J) {
            org.telegram.messenger.g0.r(foVar);
            if (this.f34249a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            org.telegram.messenger.g0.i3(foVar, j3);
        }
    }
}
