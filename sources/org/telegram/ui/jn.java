package org.telegram.ui;

import android.util.SparseIntArray;
public final class jn implements Runnable {
    public final int f39532a;
    public final on f39533b;

    public jn(on onVar, int i9) {
        this.f39532a = i9;
        this.f39533b = onVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        switch (this.f39532a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                on onVar = this.f39533b;
                onVar.f41204e = sparseIntArray;
                qn qnVar = onVar.R;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) qnVar.getThemedDrawable("drawableMsgOut");
                onVar.E = d5Var;
                b5Var = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
                d5Var.H = b5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) qnVar.getThemedDrawable("drawableMsgOutMedia");
                onVar.F = d5Var2;
                b5Var2 = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
                d5Var2.H = b5Var2.getMessageDrawableOutMediaStart();
                onVar.E.I = 0.0f;
                onVar.F.I = 0.0f;
                qnVar.uc();
                onVar.k(0.0f);
                return;
            default:
                on onVar2 = this.f39533b;
                onVar2.E.H = null;
                onVar2.F.H = null;
                onVar2.f41204e = null;
                onVar2.k(1.0f);
                return;
        }
    }
}
