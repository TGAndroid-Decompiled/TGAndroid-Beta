package org.telegram.ui;

import android.content.Context;
public final class dm extends org.telegram.ui.Cells.b0 {
    public final jm f33678f;

    public dm(jm jmVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f33678f = jmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        xn xnVar = this.f33678f.N;
        int i10 = xn.Ec;
        return xnVar.R8();
    }
}
