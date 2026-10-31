package org.telegram.ui.Components;

import android.content.Context;
public final class tv extends iy {
    public final vy H;

    public tv(vy vyVar, Context context) {
        super(vyVar, context, 1);
        this.H = vyVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.J.invalidate();
        }
    }
}
