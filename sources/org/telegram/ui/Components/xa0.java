package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xa0 {
    public final org.telegram.ui.ActionBar.m2 f30219a;
    public final cb0 f30220b;

    public xa0(cb0 cb0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f30220b = cb0Var;
        this.f30219a = m2Var;
    }

    public final void a(boolean z10) {
        cb0 cb0Var = this.f30220b;
        boolean z11 = false;
        if (cb0Var.getNeededLayoutManager() != cb0Var.getCurrentLayoutManager() && cb0Var.a()) {
            if (cb0Var.f23250f.M0 > 0) {
                cb0Var.N = true;
                cb0Var.o(false);
                return;
            }
            cb0Var.f23248b.setLayoutManager(cb0Var.getNeededLayoutManager());
        }
        if (z10 && !cb0Var.a()) {
            z10 = false;
        }
        if (!z10 || cb0Var.f23250f.K() > 0) {
            z11 = z10;
        }
        cb0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f30220b.l(z10);
    }

    public final void c() {
        long j3;
        cb0 cb0Var = this.f30220b;
        aq aqVar = cb0Var.J;
        if (cb0Var.f23248b.getLayoutManager() != cb0Var.d && cb0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(aqVar);
            if (this.f30219a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(aqVar, j3);
        }
    }
}
