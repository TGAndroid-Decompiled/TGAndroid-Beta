package org.telegram.ui.Components;

import android.content.Context;
public final class yw extends zy {
    public final mz H;

    public yw(mz mzVar, Context context) {
        super(mzVar, context, 0);
        this.H = mzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.f26614x0.invalidate();
        }
    }
}
