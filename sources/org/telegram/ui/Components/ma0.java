package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ma0 {
    public final org.telegram.ui.ActionBar.p2 f29022a;
    public final ra0 f29023b;

    public ma0(ra0 ra0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f29023b = ra0Var;
        this.f29022a = p2Var;
    }

    public final void a(boolean z4) {
        ra0 ra0Var = this.f29023b;
        boolean z10 = false;
        if (ra0Var.getNeededLayoutManager() != ra0Var.getCurrentLayoutManager() && ra0Var.a()) {
            if (ra0Var.f30710f.I0 > 0) {
                ra0Var.K = true;
                ra0Var.o(false);
                return;
            }
            ra0Var.f30707b.setLayoutManager(ra0Var.getNeededLayoutManager());
        }
        if (z4 && !ra0Var.a()) {
            z4 = false;
        }
        if (!z4 || ra0Var.f30710f.K() > 0) {
            z10 = z4;
        }
        ra0Var.o(z10);
    }

    public final void b(boolean z4) {
        this.f29023b.l(z4);
    }

    public final void c() {
        long j10;
        ra0 ra0Var = this.f29023b;
        xp xpVar = ra0Var.G;
        if (ra0Var.f30707b.getLayoutManager() != ra0Var.d && ra0Var.F) {
            AndroidUtilities.cancelRunOnUIThread(xpVar);
            if (this.f29022a.getFragmentBeginToShow()) {
                j10 = 0;
            } else {
                j10 = 100;
            }
            AndroidUtilities.runOnUIThread(xpVar, j10);
        }
    }
}
