package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class lb0 {
    public final org.telegram.ui.ActionBar.n2 f28298a;
    public final qb0 f28299b;

    public lb0(qb0 qb0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f28299b = qb0Var;
        this.f28298a = n2Var;
    }

    public final void a(boolean z10) {
        qb0 qb0Var = this.f28299b;
        boolean z11 = false;
        if (qb0Var.getNeededLayoutManager() != qb0Var.getCurrentLayoutManager() && qb0Var.a()) {
            if (qb0Var.f30167f.M0 > 0) {
                qb0Var.N = true;
                qb0Var.o(false);
                return;
            }
            qb0Var.f30164b.setLayoutManager(qb0Var.getNeededLayoutManager());
        }
        if (z10 && !qb0Var.a()) {
            z10 = false;
        }
        if (!z10 || qb0Var.f30167f.K() > 0) {
            z11 = z10;
        }
        qb0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f28299b.l(z10);
    }

    public final void c() {
        long j3;
        qb0 qb0Var = this.f28299b;
        nq nqVar = qb0Var.J;
        if (qb0Var.f30164b.getLayoutManager() != qb0Var.d && qb0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(nqVar);
            if (this.f28298a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(nqVar, j3);
        }
    }
}
