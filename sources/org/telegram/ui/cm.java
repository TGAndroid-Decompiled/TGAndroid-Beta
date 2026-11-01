package org.telegram.ui;

import android.content.Context;
public final class cm extends org.telegram.ui.Cells.a0 {
    public final fm f36347f;

    public cm(fm fmVar, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var);
        this.f36347f = fmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        un unVar = this.f36347f.Q;
        int i10 = un.f41979bd;
        return unVar.i9();
    }
}
