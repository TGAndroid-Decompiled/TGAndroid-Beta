package org.telegram.ui;

import android.content.Context;
public final class bm extends org.telegram.ui.Cells.f0 {
    public final fm L;

    public bm(fm fmVar, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var);
        this.L = fmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        un unVar = this.L.Q;
        int i10 = un.f41979bd;
        return unVar.i9();
    }
}
