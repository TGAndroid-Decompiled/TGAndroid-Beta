package org.telegram.ui.Components;

import android.content.Context;
public final class wv extends jy {
    public final wy D;

    public wv(wy wyVar, Context context) {
        super(wyVar, context, 1);
        this.D = wyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.D.F.invalidate();
        }
    }
}
