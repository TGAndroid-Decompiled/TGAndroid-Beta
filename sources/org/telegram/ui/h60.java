package org.telegram.ui;

import android.content.Context;
public final class h60 extends org.telegram.ui.Components.voip.l {
    public final j60 h;

    public h60(j60 j60Var, Context context) {
        super(context, true);
        this.h = j60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j60 j60Var = this.h;
        if (j60Var.f38024r && getParticipant() != null) {
            j60Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
