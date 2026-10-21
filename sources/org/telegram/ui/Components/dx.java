package org.telegram.ui.Components;

import android.content.Context;
public final class dx extends gz {
    public final tz H;

    public dx(tz tzVar, Context context) {
        super(tzVar, context, 0);
        this.H = tzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.f30789x0.invalidate();
        }
    }
}
