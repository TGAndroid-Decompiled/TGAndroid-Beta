package org.telegram.ui.Components;

import android.content.Context;
public final class sv extends yx {
    public final ly I;

    public sv(ly lyVar, Context context) {
        super(lyVar, context, 2);
        this.I = lyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.I.f36953h0.invalidate();
        }
    }
}
