package org.telegram.ui;

import android.content.Context;
public final class q50 extends org.telegram.ui.Components.voip.l {
    public final r50 h;

    public q50(r50 r50Var, Context context) {
        super(context, false);
        this.h = r50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x50 x50Var = this.h.M;
        if (x50Var.Q.getVisibility() == 0 && x50Var.P2) {
            x50.N(x50Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x50.N(this.h.M, this, false);
    }
}
