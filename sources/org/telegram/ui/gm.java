package org.telegram.ui;

import android.content.Context;
public final class gm extends org.telegram.ui.Cells.b0 {
    public final nm f34017f;

    public gm(nm nmVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f34017f = nmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        bo boVar = this.f34017f.Q;
        int i10 = bo.Gc;
        return boVar.R8();
    }
}
