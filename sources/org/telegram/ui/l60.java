package org.telegram.ui;

import android.content.Context;
public final class l60 extends org.telegram.ui.Components.voip.l {
    public final n60 h;

    public l60(n60 n60Var, Context context) {
        super(context, true);
        this.h = n60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n60 n60Var = this.h;
        if (n60Var.f38836r && getParticipant() != null) {
            n60Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
