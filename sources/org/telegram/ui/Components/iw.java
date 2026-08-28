package org.telegram.ui.Components;

import android.content.Context;
public final class iw extends jy {
    public final wy D;

    public iw(wy wyVar, Context context) {
        super(wyVar, context, 0);
        this.D = wyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.D.f34445t0.invalidate();
        }
    }
}
