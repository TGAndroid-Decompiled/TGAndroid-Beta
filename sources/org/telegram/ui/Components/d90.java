package org.telegram.ui.Components;
public final class d90 {
    public final org.telegram.ui.ActionBar.e2 f33890a;
    public final i90 f33891b;

    public d90(i90 i90Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f33891b = i90Var;
        this.f33890a = e2Var;
    }

    public final void a(boolean z10) {
        i90 i90Var = this.f33891b;
        boolean z11 = false;
        if (i90Var.getNeededLayoutManager() != i90Var.getCurrentLayoutManager() && i90Var.a()) {
            if (i90Var.f35523f.N0 > 0) {
                i90Var.O = true;
                i90Var.o(false);
                return;
            }
            i90Var.f35520b.setLayoutManager(i90Var.getNeededLayoutManager());
        }
        if (z10 && !i90Var.a()) {
            z10 = false;
        }
        if (!z10 || i90Var.f35523f.K() > 0) {
            z11 = z10;
        }
        i90Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f33891b.l(z10);
    }

    public final void c() {
        long j3;
        i90 i90Var = this.f33891b;
        fo foVar = i90Var.K;
        if (i90Var.f35520b.getLayoutManager() != i90Var.d && i90Var.J) {
            org.telegram.messenger.g0.r(foVar);
            if (this.f33890a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            org.telegram.messenger.g0.i3(foVar, j3);
        }
    }
}
