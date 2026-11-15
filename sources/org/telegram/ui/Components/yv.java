package org.telegram.ui.Components;

import android.content.Context;
public final class yv extends yx {
    public final ly I;

    public yv(ly lyVar, Context context) {
        super(lyVar, context, 0);
        this.I = lyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.f37007y0.invalidate();
        }
    }
}
