package org.telegram.ui;

import android.content.Context;
public final class im extends org.telegram.ui.Cells.b0 {
    public final pm f33762f;

    public im(pm pmVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f33762f = pmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        eo eoVar = this.f33762f.Q;
        int i10 = eo.Hc;
        return eoVar.R8();
    }
}
