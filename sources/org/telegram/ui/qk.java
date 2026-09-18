package org.telegram.ui;

import android.content.Context;
public final class qk extends jh.e {
    public final zn L;

    public qk(zn znVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, ij ijVar, ah.c cVar) {
        super(cVar, context, ijVar, e6Var);
        this.L = znVar;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        j6.l lVar = this.L.Ac;
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
