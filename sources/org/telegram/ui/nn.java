package org.telegram.ui;

import android.util.SparseIntArray;
public final class nn implements Runnable {
    public final int f41955a;
    public final sn f41956b;

    public nn(sn snVar, int i10) {
        this.f41955a = i10;
        this.f41956b = snVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        switch (this.f41955a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                sn snVar = this.f41956b;
                snVar.e = sparseIntArray;
                un unVar = snVar.F;
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) unVar.getThemedDrawable("drawableMsgOut");
                snVar.f43557s = l5Var;
                j5Var = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
                l5Var.J = j5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) unVar.getThemedDrawable("drawableMsgOutMedia");
                snVar.f43558t = l5Var2;
                j5Var2 = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
                l5Var2.J = j5Var2.getMessageDrawableOutMediaStart();
                snVar.f43557s.K = 0.0f;
                snVar.f43558t.K = 0.0f;
                unVar.Hc();
                snVar.s(0.0f);
                return;
            default:
                sn snVar2 = this.f41956b;
                snVar2.f43557s.J = null;
                snVar2.f43558t.J = null;
                snVar2.e = null;
                snVar2.s(1.0f);
                return;
        }
    }
}
