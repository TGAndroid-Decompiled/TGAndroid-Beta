package org.telegram.ui;

import android.content.Context;
public final class fl extends org.telegram.ui.Cells.f0 {
    public final jl L;

    public fl(jl jlVar, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, context, f6Var);
        this.L = jlVar;
    }

    @Override
    public final int getSideMenuWidth() {
        an anVar = this.L.Q;
        int i7 = an.f43707id;
        return anVar.l9();
    }
}
