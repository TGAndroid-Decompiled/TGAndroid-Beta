package org.telegram.ui.Components;

import android.content.Context;
public final class bx extends iz {
    public final wz H;

    public bx(wz wzVar, Context context) {
        super(wzVar, context, 2);
        this.H = wzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.f31026g0.invalidate();
        }
    }
}
