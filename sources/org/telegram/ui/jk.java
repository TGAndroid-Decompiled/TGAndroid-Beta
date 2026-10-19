package org.telegram.ui;

import android.content.Context;
public final class jk extends kh.e {
    public final qn L;

    public jk(qn qnVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, bj bjVar, bh.b bVar) {
        super(context, bVar, bjVar, d6Var);
        this.L = qnVar;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        j6.l lVar = this.L.Cc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0) {
            z11 = true;
        }
        lVar.h(3, z10, z11);
    }
}
