package org.telegram.ui;

import android.content.Context;
public final class g60 extends org.telegram.ui.Components.voip.l {
    public final i60 h;

    public g60(i60 i60Var, Context context) {
        super(context, true);
        this.h = i60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i60 i60Var = this.h;
        if (i60Var.f35032r && getParticipant() != null) {
            i60Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
