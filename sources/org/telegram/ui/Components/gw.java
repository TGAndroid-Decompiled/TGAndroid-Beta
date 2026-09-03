package org.telegram.ui.Components;

import android.content.Context;
public final class gw extends wy {
    public final kz E;

    public gw(kz kzVar, Context context) {
        super(kzVar, context, 1);
        this.E = kzVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.E.G.invalidate();
        }
    }
}
