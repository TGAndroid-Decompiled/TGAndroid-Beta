package org.telegram.ui.Components;

import android.content.Context;
public final class vw extends ez {
    public final rz H;

    public vw(rz rzVar, Context context) {
        super(rzVar, context, 2);
        this.H = rzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.f26817g0.invalidate();
        }
    }
}
