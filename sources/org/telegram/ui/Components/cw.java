package org.telegram.ui.Components;

import android.content.Context;
public final class cw extends jy {
    public final wy D;

    public cw(wy wyVar, Context context) {
        super(wyVar, context, 2);
        this.D = wyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.D.f34391c0.invalidate();
        }
    }
}
