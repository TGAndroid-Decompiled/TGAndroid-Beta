package org.telegram.ui.Components;

import android.content.Context;
public final class sw extends wy {
    public final kz E;

    public sw(kz kzVar, Context context) {
        super(kzVar, context, 0);
        this.E = kzVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.E.f26473u0.invalidate();
        }
    }
}
