package org.telegram.ui.Components;

import android.content.Context;
public final class lw extends zy {
    public final mz H;

    public lw(mz mzVar, Context context) {
        super(mzVar, context, 1);
        this.H = mzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.J.invalidate();
        }
    }
}
