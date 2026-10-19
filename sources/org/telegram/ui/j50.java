package org.telegram.ui;

import android.content.Context;
public final class j50 extends org.telegram.ui.Components.voip.l {
    public final k50 h;

    public j50(k50 k50Var, Context context) {
        super(context, false);
        this.h = k50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q50 q50Var = this.h.M;
        if (q50Var.Q.getVisibility() == 0 && q50Var.P2) {
            q50.O(q50Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q50.O(this.h.M, this, false);
    }
}
