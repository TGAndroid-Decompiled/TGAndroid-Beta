package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class jb0 {
    public final org.telegram.ui.ActionBar.m2 f26313a;
    public final ob0 f26314b;

    public jb0(ob0 ob0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f26314b = ob0Var;
        this.f26313a = m2Var;
    }

    public final void a(boolean z10) {
        ob0 ob0Var = this.f26314b;
        boolean z11 = false;
        if (ob0Var.getNeededLayoutManager() != ob0Var.getCurrentLayoutManager() && ob0Var.a()) {
            if (ob0Var.f27929f.M0 > 0) {
                ob0Var.N = true;
                ob0Var.o(false);
                return;
            }
            ob0Var.f27927b.setLayoutManager(ob0Var.getNeededLayoutManager());
        }
        if (z10 && !ob0Var.a()) {
            z10 = false;
        }
        if (!z10 || ob0Var.f27929f.K() > 0) {
            z11 = z10;
        }
        ob0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f26314b.l(z10);
    }

    public final void c() {
        long j10;
        ob0 ob0Var = this.f26314b;
        kq kqVar = ob0Var.J;
        if (ob0Var.f27927b.getLayoutManager() != ob0Var.d && ob0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(kqVar);
            if (this.f26313a.getFragmentBeginToShow()) {
                j10 = 0;
            } else {
                j10 = 100;
            }
            AndroidUtilities.runOnUIThread(kqVar, j10);
        }
    }
}
