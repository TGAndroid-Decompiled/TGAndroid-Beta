package org.telegram.ui.Components;

import android.content.Context;
public final class xw extends gz {
    public final tz H;

    public xw(tz tzVar, Context context) {
        super(tzVar, context, 2);
        this.H = tzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.f30738g0.invalidate();
        }
    }
}
