package org.telegram.ui.Components;

import android.content.Context;
public final class jw extends xy {
    public final kz H;

    public jw(kz kzVar, Context context) {
        super(kzVar, context, 1);
        this.H = kzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.J.invalidate();
        }
    }
}
