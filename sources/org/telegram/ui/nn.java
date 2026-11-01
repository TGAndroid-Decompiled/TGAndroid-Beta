package org.telegram.ui;

import android.util.SparseIntArray;
public final class nn implements Runnable {
    public final int f39933a;
    public final sn f39934b;

    public nn(sn snVar, int i10) {
        this.f39933a = i10;
        this.f39934b = snVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        switch (this.f39933a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                sn snVar = this.f39934b;
                snVar.e = sparseIntArray;
                un unVar = snVar.G;
                org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) unVar.getThemedDrawable("drawableMsgOut");
                snVar.f41414t = c5Var;
                z4Var = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
                c5Var.J = z4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.c5 c5Var2 = (org.telegram.ui.ActionBar.c5) unVar.getThemedDrawable("drawableMsgOutMedia");
                snVar.f41415u = c5Var2;
                z4Var2 = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
                c5Var2.J = z4Var2.getMessageDrawableOutMediaStart();
                snVar.f41414t.K = 0.0f;
                snVar.f41415u.K = 0.0f;
                unVar.Tc();
                snVar.u(0.0f);
                return;
            default:
                sn snVar2 = this.f39934b;
                snVar2.f41414t.J = null;
                snVar2.f41415u.J = null;
                snVar2.e = null;
                snVar2.u(1.0f);
                return;
        }
    }
}
