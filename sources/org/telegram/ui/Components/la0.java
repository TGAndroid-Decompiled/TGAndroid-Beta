package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class la0 {
    public final org.telegram.ui.ActionBar.p2 f26636a;
    public final qa0 f26637b;

    public la0(qa0 qa0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f26637b = qa0Var;
        this.f26636a = p2Var;
    }

    public final void a(boolean z4) {
        qa0 qa0Var = this.f26637b;
        boolean z10 = false;
        if (qa0Var.getNeededLayoutManager() != qa0Var.getCurrentLayoutManager() && qa0Var.a()) {
            if (qa0Var.f28129f.I0 > 0) {
                qa0Var.K = true;
                qa0Var.o(false);
                return;
            }
            qa0Var.f28127b.setLayoutManager(qa0Var.getNeededLayoutManager());
        }
        if (z4 && !qa0Var.a()) {
            z4 = false;
        }
        if (!z4 || qa0Var.f28129f.K() > 0) {
            z10 = z4;
        }
        qa0Var.o(z10);
    }

    public final void b(boolean z4) {
        this.f26637b.l(z4);
    }

    public final void c() {
        long j10;
        qa0 qa0Var = this.f26637b;
        up upVar = qa0Var.G;
        if (qa0Var.f28127b.getLayoutManager() != qa0Var.d && qa0Var.F) {
            AndroidUtilities.cancelRunOnUIThread(upVar);
            if (this.f26636a.getFragmentBeginToShow()) {
                j10 = 0;
            } else {
                j10 = 100;
            }
            AndroidUtilities.runOnUIThread(upVar, j10);
        }
    }
}
