package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ob0 {
    public final org.telegram.ui.ActionBar.m2 f29136a;
    public final tb0 f29137b;

    public ob0(tb0 tb0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f29137b = tb0Var;
        this.f29136a = m2Var;
    }

    public final void a(boolean z10) {
        tb0 tb0Var = this.f29137b;
        boolean z11 = false;
        if (tb0Var.getNeededLayoutManager() != tb0Var.getCurrentLayoutManager() && tb0Var.a()) {
            if (tb0Var.f30842f.M0 > 0) {
                tb0Var.N = true;
                tb0Var.o(false);
                return;
            }
            tb0Var.f30839b.setLayoutManager(tb0Var.getNeededLayoutManager());
        }
        if (z10 && !tb0Var.a()) {
            z10 = false;
        }
        if (!z10 || tb0Var.f30842f.K() > 0) {
            z11 = z10;
        }
        tb0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f29137b.l(z10);
    }

    public final void c() {
        long j3;
        tb0 tb0Var = this.f29137b;
        pq pqVar = tb0Var.J;
        if (tb0Var.f30839b.getLayoutManager() != tb0Var.d && tb0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(pqVar);
            if (this.f29136a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(pqVar, j3);
        }
    }
}
