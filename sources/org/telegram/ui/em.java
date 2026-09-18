package org.telegram.ui;

import android.content.Context;
public final class em extends org.telegram.ui.Cells.b0 {
    public final lm f33327f;

    public em(lm lmVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f33327f = lmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        zn znVar = this.f33327f.Q;
        int i10 = zn.Gc;
        return znVar.R8();
    }
}
