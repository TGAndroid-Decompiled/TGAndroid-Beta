package org.telegram.ui;

import android.content.Context;
public final class kk extends kh.e {
    public final sn L;

    public kk(sn snVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, bj bjVar, bh.b bVar) {
        super(context, bVar, bjVar, g6Var);
        this.L = snVar;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        j6.l lVar = this.L.Pc;
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
