package org.telegram.ui;

import android.content.Context;
public final class em extends org.telegram.ui.Cells.h0 {
    public final mm L;

    public em(mm mmVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.L = mmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        zn znVar = this.L.Q;
        int i10 = zn.Hc;
        return znVar.W8();
    }
}
