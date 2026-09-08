package org.telegram.ui.Components;

import android.content.Context;
public final class ww extends xy {
    public final kz H;

    public ww(kz kzVar, Context context) {
        super(kzVar, context, 0);
        this.H = kzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.f28026x0.invalidate();
        }
    }
}
