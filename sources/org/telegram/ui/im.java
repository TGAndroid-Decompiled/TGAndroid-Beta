package org.telegram.ui;

import android.content.Context;
public final class im extends org.telegram.ui.Cells.h0 {
    public final qm L;

    public im(qm qmVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.L = qmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        eo eoVar = this.L.Q;
        int i10 = eo.Hc;
        return eoVar.W8();
    }
}
