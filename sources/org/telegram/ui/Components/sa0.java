package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class sa0 {
    public final org.telegram.ui.ActionBar.p2 f26993a;
    public final xa0 f26994b;

    public sa0(xa0 xa0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f26994b = xa0Var;
        this.f26993a = p2Var;
    }

    public final void a(boolean z10) {
        xa0 xa0Var = this.f26994b;
        boolean z11 = false;
        if (xa0Var.getNeededLayoutManager() != xa0Var.getCurrentLayoutManager() && xa0Var.a()) {
            if (xa0Var.f28992f.L0 > 0) {
                xa0Var.N = true;
                xa0Var.o(false);
                return;
            }
            xa0Var.f28990b.setLayoutManager(xa0Var.getNeededLayoutManager());
        }
        if (z10 && !xa0Var.a()) {
            z10 = false;
        }
        if (!z10 || xa0Var.f28992f.K() > 0) {
            z11 = z10;
        }
        xa0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f26994b.l(z10);
    }

    public final void c() {
        long j3;
        xa0 xa0Var = this.f26994b;
        dq dqVar = xa0Var.J;
        if (xa0Var.f28990b.getLayoutManager() != xa0Var.d && xa0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(dqVar);
            if (this.f26993a.getFragmentBeginToShow()) {
                j3 = 0;
            } else {
                j3 = 100;
            }
            AndroidUtilities.runOnUIThread(dqVar, j3);
        }
    }
}
