package org.telegram.ui;

import android.content.Context;
public final class jm extends org.telegram.ui.Cells.h0 {
    public final rm L;

    public jm(rm rmVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.L = rmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        fo foVar = this.L.Q;
        int i10 = fo.Hc;
        return foVar.W8();
    }
}
