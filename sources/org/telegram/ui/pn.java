package org.telegram.ui;

import android.util.SparseIntArray;
public final class pn implements Runnable {
    public final int f42458a;
    public final un f42459b;

    public pn(un unVar, int i10) {
        this.f42458a = i10;
        this.f42459b = unVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        switch (this.f42458a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                un unVar = this.f42459b;
                unVar.e = sparseIntArray;
                wn wnVar = unVar.F;
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) wnVar.getThemedDrawable("drawableMsgOut");
                unVar.f44071s = l5Var;
                j5Var = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
                l5Var.J = j5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) wnVar.getThemedDrawable("drawableMsgOutMedia");
                unVar.f44072t = l5Var2;
                j5Var2 = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
                l5Var2.J = j5Var2.getMessageDrawableOutMediaStart();
                unVar.f44071s.K = 0.0f;
                unVar.f44072t.K = 0.0f;
                wnVar.Lc();
                unVar.s(0.0f);
                return;
            default:
                un unVar2 = this.f42459b;
                unVar2.f44071s.J = null;
                unVar2.f44072t.J = null;
                unVar2.e = null;
                unVar2.s(1.0f);
                return;
        }
    }
}
