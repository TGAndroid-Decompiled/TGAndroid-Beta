package org.telegram.ui;

import android.content.Context;
public final class b60 extends org.telegram.ui.Components.voip.l {
    public final c60 h;

    public b60(c60 c60Var, Context context) {
        super(context, false);
        this.h = c60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i60 i60Var = this.h.M;
        if (i60Var.Q.getVisibility() == 0 && i60Var.P2) {
            i60.N(i60Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i60.N(this.h.M, this, false);
    }
}
