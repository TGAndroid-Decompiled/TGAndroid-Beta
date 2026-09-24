package org.telegram.ui;

import android.content.Context;
public final class bm extends org.telegram.ui.Cells.h0 {
    public final jm L;

    public bm(jm jmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.L = jmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        wn wnVar = this.L.Q;
        int i10 = wn.Gc;
        return wnVar.R8();
    }
}
