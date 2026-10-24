package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class cb0 {
    public final org.telegram.ui.ActionBar.o2 f25289a;
    public final hb0 f25290b;

    public cb0(hb0 hb0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f25290b = hb0Var;
        this.f25289a = o2Var;
    }

    public final void a(boolean z10) {
        hb0 hb0Var = this.f25290b;
        boolean z11 = false;
        if (hb0Var.getNeededLayoutManager() != hb0Var.getCurrentLayoutManager() && hb0Var.a()) {
            if (hb0Var.f26995f.M0 > 0) {
                hb0Var.N = true;
                hb0Var.o(false);
                return;
            }
            hb0Var.f26993b.setLayoutManager(hb0Var.getNeededLayoutManager());
        }
        if (z10 && !hb0Var.a()) {
            z10 = false;
        }
        if (!z10 || hb0Var.f26995f.K() > 0) {
            z11 = z10;
        }
        hb0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f25290b.l(z10);
    }

    public final void c() {
        long j10;
        hb0 hb0Var = this.f25290b;
        xp xpVar = hb0Var.J;
        if (hb0Var.f26993b.getLayoutManager() != hb0Var.d && hb0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(xpVar);
            if (this.f25289a.getFragmentBeginToShow()) {
                j10 = 0;
            } else {
                j10 = 100;
            }
            AndroidUtilities.runOnUIThread(xpVar, j10);
        }
    }
}
