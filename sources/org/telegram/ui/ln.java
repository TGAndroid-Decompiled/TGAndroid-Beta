package org.telegram.ui;

import android.util.SparseIntArray;
public final class ln implements Runnable {
    public final int f38850a;
    public final qn f38851b;

    public ln(qn qnVar, int i10) {
        this.f38850a = i10;
        this.f38851b = qnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        switch (this.f38850a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                qn qnVar = this.f38851b;
                qnVar.e = sparseIntArray;
                sn snVar = qnVar.V;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) snVar.getThemedDrawable("drawableMsgOut");
                qnVar.I = f5Var;
                d5Var = ((org.telegram.ui.ActionBar.n2) snVar).parentLayout;
                f5Var.J = d5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.f5 f5Var2 = (org.telegram.ui.ActionBar.f5) snVar.getThemedDrawable("drawableMsgOutMedia");
                qnVar.J = f5Var2;
                d5Var2 = ((org.telegram.ui.ActionBar.n2) snVar).parentLayout;
                f5Var2.J = d5Var2.getMessageDrawableOutMediaStart();
                qnVar.I.K = 0.0f;
                qnVar.J.K = 0.0f;
                snVar.yc();
                qnVar.m(0.0f);
                return;
            default:
                qn qnVar2 = this.f38851b;
                qnVar2.I.J = null;
                qnVar2.J.J = null;
                qnVar2.e = null;
                qnVar2.m(1.0f);
                return;
        }
    }
}
