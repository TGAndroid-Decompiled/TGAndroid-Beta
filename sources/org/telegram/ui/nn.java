package org.telegram.ui;

import android.util.SparseIntArray;
public final class nn implements Runnable {
    public final int f39979a;
    public final sn f39980b;

    public nn(sn snVar, int i10) {
        this.f39979a = i10;
        this.f39980b = snVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        switch (this.f39979a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                sn snVar = this.f39980b;
                snVar.e = sparseIntArray;
                un unVar = snVar.G;
                org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) unVar.getThemedDrawable("drawableMsgOut");
                snVar.f41603t = c5Var;
                z4Var = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
                c5Var.J = z4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.c5 c5Var2 = (org.telegram.ui.ActionBar.c5) unVar.getThemedDrawable("drawableMsgOutMedia");
                snVar.f41604u = c5Var2;
                z4Var2 = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
                c5Var2.J = z4Var2.getMessageDrawableOutMediaStart();
                snVar.f41603t.K = 0.0f;
                snVar.f41604u.K = 0.0f;
                unVar.Oc();
                snVar.u(0.0f);
                return;
            default:
                sn snVar2 = this.f39980b;
                snVar2.f41603t.J = null;
                snVar2.f41604u.J = null;
                snVar2.e = null;
                snVar2.u(1.0f);
                return;
        }
    }
}
