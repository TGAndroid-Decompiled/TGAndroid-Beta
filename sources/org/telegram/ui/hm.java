package org.telegram.ui;

import android.content.Context;
public final class hm extends org.telegram.ui.Cells.h0 {
    public final pm L;

    public hm(pm pmVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.L = pmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        eo eoVar = this.L.Q;
        int i10 = eo.Hc;
        return eoVar.R8();
    }
}
