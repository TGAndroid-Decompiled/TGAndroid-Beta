package org.telegram.ui;

import android.content.Context;
public final class fk extends rg.e {
    public final qn H;

    public fk(qn qnVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, xi xiVar, ig.a aVar) {
        super(context, aVar, xiVar, b6Var);
        this.H = qnVar;
    }

    @Override
    public final void setVisibility(int i9) {
        boolean z10;
        super.setVisibility(i9);
        d5.w wVar = this.H.f42139xc;
        boolean z11 = false;
        if (i9 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0) {
            z11 = true;
        }
        wVar.j(3, z10, z11);
    }
}
