package org.telegram.ui;

import android.content.Context;
public final class i60 extends org.telegram.ui.Components.voip.l {
    public final k60 h;

    public i60(k60 k60Var, Context context) {
        super(context, true);
        this.h = k60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k60 k60Var = this.h;
        if (k60Var.f35434r && getParticipant() != null) {
            k60Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
