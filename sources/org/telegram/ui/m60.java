package org.telegram.ui;

import android.content.Context;
public final class m60 extends org.telegram.ui.Components.voip.l {
    public final o60 h;

    public m60(o60 o60Var, Context context) {
        super(context, true);
        this.h = o60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o60 o60Var = this.h;
        if (o60Var.f36110r && getParticipant() != null) {
            o60Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
