package org.telegram.ui;

import android.content.Context;
public final class o50 extends org.telegram.ui.Components.voip.l {
    public final p50 h;

    public o50(p50 p50Var, Context context) {
        super(context, false);
        this.h = p50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v50 v50Var = this.h.M;
        if (v50Var.Q.getVisibility() == 0 && v50Var.P2) {
            v50.N(v50Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v50.N(this.h.M, this, false);
    }
}
