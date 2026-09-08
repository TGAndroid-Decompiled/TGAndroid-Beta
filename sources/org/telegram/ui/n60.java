package org.telegram.ui;

import android.content.Context;
public final class n60 extends org.telegram.ui.Components.voip.l {
    public final p60 h;

    public n60(p60 p60Var, Context context) {
        super(context, true);
        this.h = p60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p60 p60Var = this.h;
        if (p60Var.f39441r && getParticipant() != null) {
            p60Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
