package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ja0 {
    public final org.telegram.ui.ActionBar.n2 f25241a;
    public final oa0 f25242b;

    public ja0(oa0 oa0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f25242b = oa0Var;
        this.f25241a = n2Var;
    }

    public final void a(boolean z10) {
        oa0 oa0Var = this.f25242b;
        boolean z11 = false;
        if (oa0Var.getNeededLayoutManager() != oa0Var.getCurrentLayoutManager() && oa0Var.a()) {
            if (oa0Var.f26696f.M0 > 0) {
                oa0Var.N = true;
                oa0Var.o(false);
                return;
            }
            oa0Var.f26694b.setLayoutManager(oa0Var.getNeededLayoutManager());
        }
        if (z10 && !oa0Var.a()) {
            z10 = false;
        }
        if (!z10 || oa0Var.f26696f.K() > 0) {
            z11 = z10;
        }
        oa0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f25242b.l(z10);
    }

    public final void c() {
        long j3;
        oa0 oa0Var = this.f25242b;
        yp ypVar = oa0Var.J;
        if (oa0Var.f26694b.getLayoutManager() != oa0Var.d && oa0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(ypVar);
            if (this.f25241a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(ypVar, j3);
        }
    }
}
