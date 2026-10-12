package org.telegram.ui;

import android.content.Context;
public final class q60 extends org.telegram.ui.Components.voip.l {
    public final s60 h;

    public q60(s60 s60Var, Context context) {
        super(context, true);
        this.h = s60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s60 s60Var = this.h;
        if (s60Var.f39977r && getParticipant() != null) {
            s60Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
