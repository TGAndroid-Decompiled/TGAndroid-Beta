package org.telegram.ui;

import android.content.Context;
public final class k50 extends org.telegram.ui.Components.voip.l {
    public final l50 h;

    public k50(l50 l50Var, Context context) {
        super(context, false);
        this.h = l50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r50 r50Var = this.h.I;
        if (r50Var.M.getVisibility() == 0 && r50Var.L2) {
            r50.M(r50Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r50.M(this.h.I, this, false);
    }
}
