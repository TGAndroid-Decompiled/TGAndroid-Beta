package org.telegram.ui;

import android.content.Context;
public final class gm extends org.telegram.ui.Cells.b0 {
    public final nm f33892f;

    public gm(nm nmVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f33892f = nmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        bo boVar = this.f33892f.Q;
        int i10 = bo.Gc;
        return boVar.R8();
    }
}
