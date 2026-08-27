package org.telegram.ui;

import android.content.Context;

public final class l50 extends org.telegram.ui.Components.voip.l {
    public final m50 h;

    public l50(m50 m50Var, Context context) {
        super(context, false);
        this.h = m50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s50 s50Var = this.h.I;
        if (s50Var.M.getVisibility() == 0 && s50Var.L2) {
            s50.N(s50Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s50.N(this.h.I, this, false);
    }
}
