package org.telegram.ui;

import android.content.Context;
public final class gl extends org.telegram.ui.Cells.a0 {
    public final jl f47462f;

    public gl(jl jlVar, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, context, e6Var);
        this.f47462f = jlVar;
    }

    @Override
    public final int getSideMenuWidth() {
        an anVar = this.f47462f.R;
        int i7 = an.f45107ld;
        return anVar.n9();
    }
}
