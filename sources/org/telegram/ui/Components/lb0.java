package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class lb0 {
    public final org.telegram.ui.ActionBar.m2 f28288a;
    public final qb0 f28289b;

    public lb0(qb0 qb0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f28289b = qb0Var;
        this.f28288a = m2Var;
    }

    public final void a(boolean z10) {
        qb0 qb0Var = this.f28289b;
        boolean z11 = false;
        if (qb0Var.getNeededLayoutManager() != qb0Var.getCurrentLayoutManager() && qb0Var.a()) {
            if (qb0Var.f30116f.M0 > 0) {
                qb0Var.N = true;
                qb0Var.o(false);
                return;
            }
            qb0Var.f30113b.setLayoutManager(qb0Var.getNeededLayoutManager());
        }
        if (z10 && !qb0Var.a()) {
            z10 = false;
        }
        if (!z10 || qb0Var.f30116f.K() > 0) {
            z11 = z10;
        }
        qb0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f28289b.l(z10);
    }

    public final void c() {
        long j3;
        qb0 qb0Var = this.f28289b;
        nq nqVar = qb0Var.J;
        if (qb0Var.f30113b.getLayoutManager() != qb0Var.d && qb0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(nqVar);
            if (this.f28288a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(nqVar, j3);
        }
    }
}
