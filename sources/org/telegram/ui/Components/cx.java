package org.telegram.ui.Components;

import android.content.Context;
public final class cx extends fz {
    public final sz H;

    public cx(sz szVar, Context context) {
        super(szVar, context, 0);
        this.H = szVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.f32779x0.invalidate();
        }
    }
}
