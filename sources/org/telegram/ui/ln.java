package org.telegram.ui;

import android.util.SparseIntArray;
public final class ln implements Runnable {
    public final int f39278a;
    public final qn f39279b;

    public ln(qn qnVar, int i10) {
        this.f39278a = i10;
        this.f39279b = qnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        switch (this.f39278a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                qn qnVar = this.f39279b;
                qnVar.e = sparseIntArray;
                sn snVar = qnVar.F;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) snVar.getThemedDrawable("drawableMsgOut");
                qnVar.f40883s = j5Var;
                h5Var = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
                j5Var.J = h5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) snVar.getThemedDrawable("drawableMsgOutMedia");
                qnVar.f40884t = j5Var2;
                h5Var2 = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
                j5Var2.J = h5Var2.getMessageDrawableOutMediaStart();
                qnVar.f40883s.K = 0.0f;
                qnVar.f40884t.K = 0.0f;
                snVar.Bc();
                qnVar.s(0.0f);
                return;
            default:
                qn qnVar2 = this.f39279b;
                qnVar2.f40883s.J = null;
                qnVar2.f40884t.J = null;
                qnVar2.e = null;
                qnVar2.s(1.0f);
                return;
        }
    }
}
