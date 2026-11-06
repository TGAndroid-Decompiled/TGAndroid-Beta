package org.telegram.ui;

import android.content.Context;
public final class gl extends org.telegram.ui.Cells.a0 {
    public final jl f46024f;

    public gl(jl jlVar, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, context, f6Var);
        this.f46024f = jlVar;
    }

    @Override
    public final int getSideMenuWidth() {
        an anVar = this.f46024f.Q;
        int i7 = an.f43706id;
        return anVar.l9();
    }
}
