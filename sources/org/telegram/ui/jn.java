package org.telegram.ui;

import android.util.SparseIntArray;
public final class jn implements Runnable {
    public final int f38287a;
    public final on f38288b;

    public jn(on onVar, int i10) {
        this.f38287a = i10;
        this.f38288b = onVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        switch (this.f38287a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                on onVar = this.f38288b;
                onVar.e = sparseIntArray;
                qn qnVar = onVar.V;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) qnVar.getThemedDrawable("drawableMsgOut");
                onVar.I = f5Var;
                d5Var = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
                f5Var.J = d5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.f5 f5Var2 = (org.telegram.ui.ActionBar.f5) qnVar.getThemedDrawable("drawableMsgOutMedia");
                onVar.J = f5Var2;
                d5Var2 = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
                f5Var2.J = d5Var2.getMessageDrawableOutMediaStart();
                onVar.I.K = 0.0f;
                onVar.J.K = 0.0f;
                qnVar.zc();
                onVar.m(0.0f);
                return;
            default:
                on onVar2 = this.f38288b;
                onVar2.I.J = null;
                onVar2.J.J = null;
                onVar2.e = null;
                onVar2.m(1.0f);
                return;
        }
    }
}
