package org.telegram.ui.Components;

import android.content.Context;
public final class sw extends zy {
    public final mz H;

    public sw(mz mzVar, Context context) {
        super(mzVar, context, 2);
        this.H = mzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.f26543g0.invalidate();
        }
    }
}
