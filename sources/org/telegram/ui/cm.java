package org.telegram.ui;

import android.content.Context;
public final class cm extends org.telegram.ui.Cells.b0 {
    public final jm f35503f;

    public cm(jm jmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f35503f = jmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        yn ynVar = this.f35503f.Q;
        int i10 = yn.Bc;
        return ynVar.S8();
    }
}
