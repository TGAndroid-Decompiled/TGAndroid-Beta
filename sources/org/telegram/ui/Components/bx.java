package org.telegram.ui.Components;

import android.content.Context;
public final class bx extends ez {
    public final rz H;

    public bx(rz rzVar, Context context) {
        super(rzVar, context, 0);
        this.H = rzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.f26871x0.invalidate();
        }
    }
}
