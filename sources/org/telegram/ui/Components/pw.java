package org.telegram.ui.Components;

import android.content.Context;
public final class pw extends xy {
    public final kz H;

    public pw(kz kzVar, Context context) {
        super(kzVar, context, 2);
        this.H = kzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.f25715g0.invalidate();
        }
    }
}
