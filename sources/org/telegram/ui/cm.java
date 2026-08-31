package org.telegram.ui;

import android.content.Context;
public final class cm extends org.telegram.ui.Cells.h0 {
    public final jm I;

    public cm(jm jmVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.I = jmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        xn xnVar = this.I.N;
        int i10 = xn.Ec;
        return xnVar.R8();
    }
}
