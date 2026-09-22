package org.telegram.ui;

import android.content.Context;
public final class em extends org.telegram.ui.Cells.b0 {
    public final lm f33396f;

    public em(lm lmVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f33396f = lmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        zn znVar = this.f33396f.Q;
        int i10 = zn.Gc;
        return znVar.R8();
    }
}
