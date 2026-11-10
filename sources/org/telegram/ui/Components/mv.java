package org.telegram.ui.Components;

import android.content.Context;
public final class mv extends tx {
    public final gy H;

    public mv(gy gyVar, Context context) {
        super(gyVar, context, 2);
        this.H = gyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.H.f34028g0.invalidate();
        }
    }
}
