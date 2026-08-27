package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class v90 {

    public final org.telegram.ui.ActionBar.n2 f33336a;

    public final aa0 f33337b;

    public v90(aa0 aa0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f33337b = aa0Var;
        this.f33336a = n2Var;
    }

    public final void a(boolean z10) {
        aa0 aa0Var = this.f33337b;
        if (aa0Var.getNeededLayoutManager() != aa0Var.getCurrentLayoutManager() && aa0Var.a()) {
            if (aa0Var.f26703f.H0 > 0) {
                aa0Var.J = true;
                aa0Var.o(false);
                return;
            }
            aa0Var.f26700b.setLayoutManager(aa0Var.getNeededLayoutManager());
        }
        if (z10 && !aa0Var.a()) {
            z10 = false;
        }
        aa0Var.o((!z10 || aa0Var.f26703f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.f33337b.l(z10);
    }

    public final void c() {
        aa0 aa0Var = this.f33337b;
        lp lpVar = aa0Var.F;
        if (aa0Var.f26700b.getLayoutManager() == aa0Var.d || !aa0Var.E) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(lpVar);
        AndroidUtilities.runOnUIThread(lpVar, this.f33336a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
