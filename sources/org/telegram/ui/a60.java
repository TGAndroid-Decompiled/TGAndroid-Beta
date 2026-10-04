package org.telegram.ui;

import android.content.Context;
public final class a60 extends org.telegram.ui.Components.voip.l {
    public final b60 h;

    public a60(b60 b60Var, Context context) {
        super(context, false);
        this.h = b60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h60 h60Var = this.h.M;
        if (h60Var.Q.getVisibility() == 0 && h60Var.P2) {
            h60.L(h60Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h60.L(this.h.M, this, false);
    }
}
