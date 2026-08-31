package org.telegram.ui;

import android.content.Context;
public final class dm extends org.telegram.ui.Cells.b0 {
    public final jm f36260f;

    public dm(jm jmVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.f36260f = jmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        xn xnVar = this.f36260f.N;
        int i10 = xn.Ec;
        return xnVar.R8();
    }
}
