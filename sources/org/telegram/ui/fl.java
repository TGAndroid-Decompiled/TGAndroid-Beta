package org.telegram.ui;

import android.content.Context;
public final class fl extends org.telegram.ui.Cells.f0 {
    public final jl M;

    public fl(jl jlVar, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, context, e6Var);
        this.M = jlVar;
    }

    @Override
    public final int getSideMenuWidth() {
        an anVar = this.M.R;
        int i7 = an.f45107ld;
        return anVar.n9();
    }
}
