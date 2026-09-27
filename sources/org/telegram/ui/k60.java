package org.telegram.ui;

import android.content.Context;
public final class k60 extends org.telegram.ui.Components.voip.l {
    public final m60 h;

    public k60(m60 m60Var, Context context) {
        super(context, true);
        this.h = m60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m60 m60Var = this.h;
        if (m60Var.f35527r && getParticipant() != null) {
            m60Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
