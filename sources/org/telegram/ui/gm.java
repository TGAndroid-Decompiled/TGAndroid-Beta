package org.telegram.ui;

import android.content.Context;
public final class gm extends org.telegram.ui.Cells.b0 {
    public final nm f33959f;

    public gm(nm nmVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f33959f = nmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        bo boVar = this.f33959f.Q;
        int i10 = bo.Hc;
        return boVar.R8();
    }
}
