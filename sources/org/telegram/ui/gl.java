package org.telegram.ui;

import android.content.Context;
public final class gl extends org.telegram.ui.Cells.a0 {
    public final jl f45998f;

    public gl(jl jlVar, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, context, f6Var);
        this.f45998f = jlVar;
    }

    @Override
    public final int getSideMenuWidth() {
        an anVar = this.f45998f.Q;
        int i7 = an.f43682id;
        return anVar.l9();
    }
}
