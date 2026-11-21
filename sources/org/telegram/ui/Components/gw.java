package org.telegram.ui.Components;

import android.content.Context;
public final class gw extends gy {
    public final ty I;

    public gw(ty tyVar, Context context) {
        super(tyVar, context, 0);
        this.I = tyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.f40165y0.invalidate();
        }
    }
}
