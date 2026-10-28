package org.telegram.ui;

import android.content.Context;
public final class b60 extends org.telegram.ui.Components.voip.l {
    public final d60 h;

    public b60(d60 d60Var, Context context) {
        super(context, true);
        this.h = d60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d60 d60Var = this.h;
        if (d60Var.f38524r && getParticipant() != null) {
            d60Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
