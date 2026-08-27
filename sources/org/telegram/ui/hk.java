package org.telegram.ui;

import android.content.Context;

public final class hk extends sg.e {
    public final rn H;

    public hk(rn rnVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, zi ziVar, jg.a aVar) {
        super(context, aVar, ziVar, c6Var);
        this.H = rnVar;
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.H.f42275xc.j(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
