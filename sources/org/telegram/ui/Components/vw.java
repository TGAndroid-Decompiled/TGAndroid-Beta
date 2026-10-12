package org.telegram.ui.Components;

import android.content.Context;
public final class vw extends iz {
    public final wz H;

    public vw(wz wzVar, Context context) {
        super(wzVar, context, 1);
        this.H = wzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.J.invalidate();
        }
    }
}
