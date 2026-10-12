package org.telegram.ui;

import android.content.Context;
public final class g60 extends org.telegram.ui.Components.voip.l {
    public final h60 h;

    public g60(h60 h60Var, Context context) {
        super(context, false);
        this.h = h60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n60 n60Var = this.h.M;
        if (n60Var.Q.getVisibility() == 0 && n60Var.P2) {
            n60.O(n60Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n60.O(this.h.M, this, false);
    }
}
