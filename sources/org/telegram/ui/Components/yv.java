package org.telegram.ui.Components;

import android.content.Context;
public final class yv extends iy {
    public final vy H;

    public yv(vy vyVar, Context context) {
        super(vyVar, context, 2);
        this.H = vyVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.f31955g0.invalidate();
        }
    }
}
