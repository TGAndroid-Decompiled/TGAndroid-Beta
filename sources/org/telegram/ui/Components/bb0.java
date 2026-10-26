package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class bb0 {
    public final org.telegram.ui.ActionBar.r2 f26817a;
    public final gb0 f26818b;

    public bb0(gb0 gb0Var, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f26818b = gb0Var;
        this.f26817a = r2Var;
    }

    public final void a(boolean z10) {
        gb0 gb0Var = this.f26818b;
        boolean z11 = false;
        if (gb0Var.getNeededLayoutManager() != gb0Var.getCurrentLayoutManager() && gb0Var.a()) {
            if (gb0Var.f28522f.M0 > 0) {
                gb0Var.N = true;
                gb0Var.o(false);
                return;
            }
            gb0Var.f28520b.setLayoutManager(gb0Var.getNeededLayoutManager());
        }
        if (z10 && !gb0Var.a()) {
            z10 = false;
        }
        if (!z10 || gb0Var.f28522f.K() > 0) {
            z11 = z10;
        }
        gb0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f26818b.l(z10);
    }

    public final void c() {
        long j10;
        gb0 gb0Var = this.f26818b;
        wa0 wa0Var = gb0Var.J;
        if (gb0Var.f28520b.getLayoutManager() != gb0Var.d && gb0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(wa0Var);
            if (this.f26817a.getFragmentBeginToShow()) {
                j10 = 0;
            } else {
                j10 = 100;
            }
            AndroidUtilities.runOnUIThread(wa0Var, j10);
        }
    }
}
