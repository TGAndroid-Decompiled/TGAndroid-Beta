package org.telegram.ui;

import android.util.SparseIntArray;

public final class kn implements Runnable {

    public final int f39811a;

    public final pn f39812b;

    public kn(pn pnVar, int i10) {
        this.f39811a = i10;
        this.f39812b = pnVar;
    }

    @Override
    public final void run() {
        switch (this.f39811a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                pn pnVar = this.f39812b;
                pnVar.f41394e = sparseIntArray;
                rn rnVar = pnVar.R;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) rnVar.getThemedDrawable("drawableMsgOut");
                pnVar.E = d5Var;
                d5Var.H = ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) rnVar.getThemedDrawable("drawableMsgOutMedia");
                pnVar.F = d5Var2;
                d5Var2.H = ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout.getMessageDrawableOutMediaStart();
                pnVar.E.I = 0.0f;
                pnVar.F.I = 0.0f;
                rnVar.uc();
                pnVar.k(0.0f);
                break;
            default:
                pn pnVar2 = this.f39812b;
                pnVar2.E.H = null;
                pnVar2.F.H = null;
                pnVar2.f41394e = null;
                pnVar2.k(1.0f);
                break;
        }
    }
}
