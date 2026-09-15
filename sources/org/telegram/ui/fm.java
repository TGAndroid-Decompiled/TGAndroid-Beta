package org.telegram.ui;

import android.content.Context;
public final class fm extends org.telegram.ui.Cells.h0 {
    public final nm L;

    public fm(nm nmVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.L = nmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        bo boVar = this.L.Q;
        int i10 = bo.Hc;
        return boVar.R8();
    }
}
