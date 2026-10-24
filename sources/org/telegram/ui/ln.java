package org.telegram.ui;

import android.util.SparseIntArray;
public final class ln implements Runnable {
    public final int f39319a;
    public final qn f39320b;

    public ln(qn qnVar, int i10) {
        this.f39319a = i10;
        this.f39320b = qnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        switch (this.f39319a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                qn qnVar = this.f39320b;
                qnVar.e = sparseIntArray;
                sn snVar = qnVar.F;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) snVar.getThemedDrawable("drawableMsgOut");
                qnVar.f40894s = j5Var;
                h5Var = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
                j5Var.J = h5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) snVar.getThemedDrawable("drawableMsgOutMedia");
                qnVar.f40895t = j5Var2;
                h5Var2 = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
                j5Var2.J = h5Var2.getMessageDrawableOutMediaStart();
                qnVar.f40894s.K = 0.0f;
                qnVar.f40895t.K = 0.0f;
                snVar.Bc();
                qnVar.s(0.0f);
                return;
            default:
                qn qnVar2 = this.f39320b;
                qnVar2.f40894s.J = null;
                qnVar2.f40895t.J = null;
                qnVar2.e = null;
                qnVar2.s(1.0f);
                return;
        }
    }
}
