package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r90 {
    public final org.telegram.ui.ActionBar.o2 f32118a;
    public final w90 f32119b;

    public r90(w90 w90Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f32119b = w90Var;
        this.f32118a = o2Var;
    }

    public final void a(boolean z10) {
        w90 w90Var = this.f32119b;
        boolean z11 = false;
        if (w90Var.getNeededLayoutManager() != w90Var.getCurrentLayoutManager() && w90Var.a()) {
            if (w90Var.f34159f.H0 > 0) {
                w90Var.J = true;
                w90Var.o(false);
                return;
            }
            w90Var.f34156b.setLayoutManager(w90Var.getNeededLayoutManager());
        }
        if (z10 && !w90Var.a()) {
            z10 = false;
        }
        if (!z10 || w90Var.f34159f.K() > 0) {
            z11 = z10;
        }
        w90Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f32119b.l(z10);
    }

    public final void c() {
        long j10;
        w90 w90Var = this.f32119b;
        np npVar = w90Var.F;
        if (w90Var.f34156b.getLayoutManager() != w90Var.d && w90Var.E) {
            AndroidUtilities.cancelRunOnUIThread(npVar);
            if (this.f32118a.getFragmentBeginToShow()) {
                j10 = 0;
            } else {
                j10 = 100;
            }
            AndroidUtilities.runOnUIThread(npVar, j10);
        }
    }
}
