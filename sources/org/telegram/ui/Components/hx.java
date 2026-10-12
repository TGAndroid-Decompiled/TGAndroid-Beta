package org.telegram.ui.Components;

import android.content.Context;
public final class hx extends iz {
    public final wz H;

    public hx(wz wzVar, Context context) {
        super(wzVar, context, 0);
        this.H = wzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.f31080x0.invalidate();
        }
    }
}
