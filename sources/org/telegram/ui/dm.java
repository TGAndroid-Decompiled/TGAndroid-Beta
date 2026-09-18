package org.telegram.ui;

import android.content.Context;
public final class dm extends org.telegram.ui.Cells.h0 {
    public final lm L;

    public dm(lm lmVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.L = lmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        zn znVar = this.L.Q;
        int i10 = zn.Gc;
        return znVar.R8();
    }
}
