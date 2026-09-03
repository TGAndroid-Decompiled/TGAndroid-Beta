package org.telegram.ui;

import android.content.Context;
public final class em extends org.telegram.ui.Cells.h0 {
    public final lm I;

    public em(lm lmVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.I = lmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        zn znVar = this.I.N;
        int i10 = zn.Ec;
        return znVar.R8();
    }
}
