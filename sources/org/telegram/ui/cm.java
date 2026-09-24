package org.telegram.ui;

import android.content.Context;
public final class cm extends org.telegram.ui.Cells.b0 {
    public final jm f32729f;

    public cm(jm jmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f32729f = jmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        wn wnVar = this.f32729f.Q;
        int i10 = wn.Gc;
        return wnVar.R8();
    }
}
