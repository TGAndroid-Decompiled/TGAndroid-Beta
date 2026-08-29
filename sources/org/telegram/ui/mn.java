package org.telegram.ui;

import android.util.SparseIntArray;
public final class mn implements Runnable {
    public final int f40609a;
    public final rn f40610b;

    public mn(rn rnVar, int i10) {
        this.f40609a = i10;
        this.f40610b = rnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        switch (this.f40609a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                rn rnVar = this.f40610b;
                rnVar.f42155e = sparseIntArray;
                tn tnVar = rnVar.R;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) tnVar.getThemedDrawable("drawableMsgOut");
                rnVar.E = d5Var;
                b5Var = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
                d5Var.H = b5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) tnVar.getThemedDrawable("drawableMsgOutMedia");
                rnVar.F = d5Var2;
                b5Var2 = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
                d5Var2.H = b5Var2.getMessageDrawableOutMediaStart();
                rnVar.E.I = 0.0f;
                rnVar.F.I = 0.0f;
                tnVar.uc();
                rnVar.k(0.0f);
                return;
            default:
                rn rnVar2 = this.f40610b;
                rnVar2.E.H = null;
                rnVar2.F.H = null;
                rnVar2.f42155e = null;
                rnVar2.k(1.0f);
                return;
        }
    }
}
