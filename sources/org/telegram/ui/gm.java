package org.telegram.ui;

import android.content.Context;
public final class gm extends org.telegram.ui.Cells.h0 {
    public final om L;

    public gm(om omVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.L = omVar;
    }

    @Override
    public final int getSideMenuWidth() {
        co coVar = this.L.Q;
        int i10 = co.Hc;
        return coVar.R8();
    }
}
