package org.telegram.ui;

import android.content.Context;
public final class qj extends mh.e {
    public final wm M;

    public qj(wm wmVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, ki kiVar, eh.c cVar) {
        super(context, cVar, kiVar, e6Var);
        this.M = wmVar;
    }

    @Override
    public final void setVisibility(int i3) {
        boolean z10;
        super.setVisibility(i3);
        l6.n nVar = this.M.f51333gd;
        boolean z11 = false;
        if (i3 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0) {
            z11 = true;
        }
        nVar.h(3, z10, z11);
    }
}
