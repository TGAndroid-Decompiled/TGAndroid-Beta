package org.telegram.ui;

import android.content.Context;
public final class o60 extends org.telegram.ui.Components.voip.l {
    public final q60 h;

    public o60(q60 q60Var, Context context) {
        super(context, true);
        this.h = q60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q60 q60Var = this.h;
        if (q60Var.f36815r && getParticipant() != null) {
            q60Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
