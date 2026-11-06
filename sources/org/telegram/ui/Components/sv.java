package org.telegram.ui.Components;

import android.content.Context;
public final class sv extends tx {
    public final gy H;

    public sv(gy gyVar, Context context) {
        super(gyVar, context, 0);
        this.H = gyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.H.f34141x0.invalidate();
        }
    }
}
