package org.telegram.ui;

import android.content.Context;
public final class ok extends jh.e {
    public final yn L;

    public ok(yn ynVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, hj hjVar, ah.c cVar) {
        super(cVar, context, hjVar, d6Var);
        this.L = ynVar;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        j6.l lVar = this.L.f43583yc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0) {
            z11 = true;
        }
        lVar.j(3, z10, z11);
    }
}
