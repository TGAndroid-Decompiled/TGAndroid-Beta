package org.telegram.ui;

import android.content.Context;
public final class jm extends org.telegram.ui.Cells.b0 {
    public final qm f39249f;

    public jm(qm qmVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f39249f = qmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        eo eoVar = this.f39249f.Q;
        int i10 = eo.Hc;
        return eoVar.W8();
    }
}
