package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bn extends ye.c {
    public final org.telegram.ui.Cells.s1 d;
    public final fn f36831e;

    public bn(fn fnVar, org.telegram.ui.Cells.s1 s1Var) {
        this.f36831e = fnVar;
        this.d = s1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new rj(this.f36831e.f38212a, 8), 250L);
        }
    }

    @Override
    public final void d() {
        fn fnVar = this.f36831e;
        tn tnVar = fnVar.f38212a;
        org.telegram.ui.Cells.s1 s1Var = this.d;
        tnVar.f42971sb = s1Var.getMessageObject().getId();
        tn tnVar2 = fnVar.f38212a;
        tnVar2.f42984tb = 2;
        tnVar2.f42997ub = null;
        s1Var.invalidate();
    }
}
