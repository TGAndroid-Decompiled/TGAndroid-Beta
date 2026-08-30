package org.telegram.ui.Components;

import android.content.Context;
public final class mw extends wy {
    public final kz E;

    public mw(kz kzVar, Context context) {
        super(kzVar, context, 2);
        this.E = kzVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.E.f26420d0.invalidate();
        }
    }
}
