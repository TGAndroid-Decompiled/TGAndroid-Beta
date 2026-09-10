package org.telegram.ui.Components;

import android.content.Context;
public final class pw extends ez {
    public final rz H;

    public pw(rz rzVar, Context context) {
        super(rzVar, context, 1);
        this.H = rzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.J.invalidate();
        }
    }
}
