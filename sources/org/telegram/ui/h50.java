package org.telegram.ui;

import android.content.Context;
public final class h50 extends org.telegram.ui.Components.voip.l {
    public final i50 h;

    public h50(i50 i50Var, Context context) {
        super(context, false);
        this.h = i50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o50 o50Var = this.h.I;
        if (o50Var.M.getVisibility() == 0 && o50Var.L2) {
            o50.M(o50Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o50.M(this.h.I, this, false);
    }
}
