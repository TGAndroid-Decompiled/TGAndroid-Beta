package org.telegram.ui.Components;

import android.content.Context;
public final class fw extends iy {
    public final vy H;

    public fw(vy vyVar, Context context) {
        super(vyVar, context, 0);
        this.H = vyVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.f32009x0.invalidate();
        }
    }
}
