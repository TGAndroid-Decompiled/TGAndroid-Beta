package org.telegram.ui;

import android.content.Context;
public final class gl extends org.telegram.ui.Cells.a0 {
    public final jl f47472f;

    public gl(jl jlVar, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, context, e6Var);
        this.f47472f = jlVar;
    }

    @Override
    public final int getSideMenuWidth() {
        an anVar = this.f47472f.R;
        int i7 = an.f45108ld;
        return anVar.n9();
    }
}
