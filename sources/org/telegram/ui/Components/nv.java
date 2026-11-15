package org.telegram.ui.Components;

import android.content.Context;
public final class nv extends yx {
    public final ly I;

    public nv(ly lyVar, Context context) {
        super(lyVar, context, 1);
        this.I = lyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.K.invalidate();
        }
    }
}
