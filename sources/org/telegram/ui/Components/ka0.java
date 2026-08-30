package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ka0 {
    public final org.telegram.ui.ActionBar.p2 f26246a;
    public final pa0 f26247b;

    public ka0(pa0 pa0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f26247b = pa0Var;
        this.f26246a = p2Var;
    }

    public final void a(boolean z4) {
        pa0 pa0Var = this.f26247b;
        boolean z10 = false;
        if (pa0Var.getNeededLayoutManager() != pa0Var.getCurrentLayoutManager() && pa0Var.a()) {
            if (pa0Var.f27803f.I0 > 0) {
                pa0Var.K = true;
                pa0Var.o(false);
                return;
            }
            pa0Var.f27801b.setLayoutManager(pa0Var.getNeededLayoutManager());
        }
        if (z4 && !pa0Var.a()) {
            z4 = false;
        }
        if (!z4 || pa0Var.f27803f.K() > 0) {
            z10 = z4;
        }
        pa0Var.o(z10);
    }

    public final void b(boolean z4) {
        this.f26247b.l(z4);
    }

    public final void c() {
        long j10;
        pa0 pa0Var = this.f26247b;
        vp vpVar = pa0Var.G;
        if (pa0Var.f27801b.getLayoutManager() != pa0Var.d && pa0Var.F) {
            AndroidUtilities.cancelRunOnUIThread(vpVar);
            if (this.f26246a.getFragmentBeginToShow()) {
                j10 = 0;
            } else {
                j10 = 100;
            }
            AndroidUtilities.runOnUIThread(vpVar, j10);
        }
    }
}
