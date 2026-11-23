package org.telegram.ui.Components;

import android.content.Context;
public final class zv extends gy {
    public final ty I;

    public zv(ty tyVar, Context context) {
        super(tyVar, context, 2);
        this.I = tyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.I.f40086h0.invalidate();
        }
    }
}
