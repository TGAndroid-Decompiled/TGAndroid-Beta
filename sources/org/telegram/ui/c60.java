package org.telegram.ui;

import android.content.Context;
public final class c60 extends org.telegram.ui.Components.voip.l {
    public final d60 h;

    public c60(d60 d60Var, Context context) {
        super(context, false);
        this.h = d60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j60 j60Var = this.h.M;
        if (j60Var.Q.getVisibility() == 0 && j60Var.P2) {
            j60.N(j60Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j60.N(this.h.M, this, false);
    }
}
