package org.telegram.ui;

import android.content.Context;
public final class j60 extends org.telegram.ui.Components.voip.l {
    public final l60 h;

    public j60(l60 l60Var, Context context) {
        super(context, true);
        this.h = l60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l60 l60Var = this.h;
        if (l60Var.f34871r && getParticipant() != null) {
            l60Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
