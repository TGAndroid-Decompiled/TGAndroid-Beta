package org.telegram.ui;

import android.content.Context;
public final class qk extends bh.h {
    public final un L;

    public qk(un unVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, jj jjVar, tg.b bVar) {
        super(context, p6Var, bVar, jjVar);
        this.L = unVar;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        j6.m mVar = this.L.Yc;
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
