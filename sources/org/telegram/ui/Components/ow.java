package org.telegram.ui.Components;

import android.content.Context;
public final class ow extends yy {
    public final mz E;

    public ow(mz mzVar, Context context) {
        super(mzVar, context, 2);
        this.E = mzVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.E.f29276d0.invalidate();
        }
    }
}
