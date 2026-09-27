package org.telegram.ui;

import android.content.Context;
public final class cm extends org.telegram.ui.Cells.h0 {
    public final km L;

    public cm(km kmVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.L = kmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        xn xnVar = this.L.Q;
        int i10 = xn.Gc;
        return xnVar.R8();
    }
}
