package org.telegram.ui;

import android.content.Context;
public final class n50 extends org.telegram.ui.Components.voip.l {
    public final o50 h;

    public n50(o50 o50Var, Context context) {
        super(context, false);
        this.h = o50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u50 u50Var = this.h.M;
        if (u50Var.Q.getVisibility() == 0 && u50Var.P2) {
            u50.N(u50Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u50.N(this.h.M, this, false);
    }
}
