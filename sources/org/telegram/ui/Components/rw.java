package org.telegram.ui.Components;

import android.content.Context;
public final class rw extends gz {
    public final tz H;

    public rw(tz tzVar, Context context) {
        super(tzVar, context, 1);
        this.H = tzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.J.invalidate();
        }
    }
}
