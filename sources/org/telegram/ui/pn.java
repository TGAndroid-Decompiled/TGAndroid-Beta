package org.telegram.ui;

import android.util.SparseIntArray;
public final class pn implements Runnable {
    public final int f36583a;
    public final un f36584b;

    public pn(un unVar, int i10) {
        this.f36583a = i10;
        this.f36584b = unVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        switch (this.f36583a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                un unVar = this.f36584b;
                unVar.e = sparseIntArray;
                wn wnVar = unVar.V;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) wnVar.getThemedDrawable("drawableMsgOut");
                unVar.I = d5Var;
                b5Var = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
                d5Var.H = b5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) wnVar.getThemedDrawable("drawableMsgOutMedia");
                unVar.J = d5Var2;
                b5Var2 = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
                d5Var2.H = b5Var2.getMessageDrawableOutMediaStart();
                unVar.I.I = 0.0f;
                unVar.J.I = 0.0f;
                wnVar.uc();
                unVar.k(0.0f);
                return;
            default:
                un unVar2 = this.f36584b;
                unVar2.I.H = null;
                unVar2.J.H = null;
                unVar2.e = null;
                unVar2.k(1.0f);
                return;
        }
    }
}
