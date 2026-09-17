package org.telegram.ui;

import android.content.Context;
public final class d60 extends org.telegram.ui.Components.voip.l {
    public final e60 h;

    public d60(e60 e60Var, Context context) {
        super(context, false);
        this.h = e60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k60 k60Var = this.h.M;
        if (k60Var.Q.getVisibility() == 0 && k60Var.P2) {
            k60.N(k60Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k60.N(this.h.M, this, false);
    }
}
