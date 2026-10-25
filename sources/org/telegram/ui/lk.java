package org.telegram.ui;

import android.content.Context;
public final class lk extends lh.e {
    public final un M;

    public lk(un unVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, cj cjVar, ch.b bVar) {
        super(context, bVar, cjVar, u6Var);
        this.M = unVar;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        k6.m mVar = this.M.Yc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0) {
            z11 = true;
        }
        mVar.h(3, z10, z11);
    }
}
