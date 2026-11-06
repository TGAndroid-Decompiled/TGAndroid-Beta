package org.telegram.ui.Components;

import android.content.Context;
public final class hv extends tx {
    public final gy H;

    public hv(gy gyVar, Context context) {
        super(gyVar, context, 1);
        this.H = gyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.H.J.invalidate();
        }
    }
}
