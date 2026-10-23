package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class eb0 {
    public final org.telegram.ui.ActionBar.o2 f25953a;
    public final jb0 f25954b;

    public eb0(jb0 jb0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f25954b = jb0Var;
        this.f25953a = o2Var;
    }

    public final void a(boolean z10) {
        jb0 jb0Var = this.f25954b;
        boolean z11 = false;
        if (jb0Var.getNeededLayoutManager() != jb0Var.getCurrentLayoutManager() && jb0Var.a()) {
            if (jb0Var.f27655f.M0 > 0) {
                jb0Var.N = true;
                jb0Var.o(false);
                return;
            }
            jb0Var.f27653b.setLayoutManager(jb0Var.getNeededLayoutManager());
        }
        if (z10 && !jb0Var.a()) {
            z10 = false;
        }
        if (!z10 || jb0Var.f27655f.K() > 0) {
            z11 = z10;
        }
        jb0Var.o(z11);
    }

    public final void b(boolean z10) {
        this.f25954b.l(z10);
    }

    public final void c() {
        long j10;
        jb0 jb0Var = this.f25954b;
        zp zpVar = jb0Var.J;
        if (jb0Var.f27653b.getLayoutManager() != jb0Var.d && jb0Var.I) {
            AndroidUtilities.cancelRunOnUIThread(zpVar);
            if (this.f25953a.getFragmentBeginToShow()) {
                j10 = 0;
            } else {
                j10 = 100;
            }
            AndroidUtilities.runOnUIThread(zpVar, j10);
        }
    }
}
