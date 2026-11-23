package org.telegram.ui.Components;

import android.content.Context;
public final class xv extends dy {
    public final qy I;

    public xv(qy qyVar, Context context) {
        super(qyVar, context, 2);
        this.I = qyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.I.f39059h0.invalidate();
        }
    }
}
