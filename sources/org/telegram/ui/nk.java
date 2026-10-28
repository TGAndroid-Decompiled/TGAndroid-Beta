package org.telegram.ui;

import android.content.Context;
public final class nk extends lh.e {
    public final wn M;

    public nk(wn wnVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, fj fjVar, ch.b bVar) {
        super(context, bVar, fjVar, u6Var);
        this.M = wnVar;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        k6.m mVar = this.M.f45086cd;
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
