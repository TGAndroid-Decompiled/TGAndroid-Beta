package org.telegram.ui.Components;

import android.content.Context;
public final class zw extends az {
    public final nz H;

    public zw(nz nzVar, Context context) {
        super(nzVar, context, 0);
        this.H = nzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.f26884x0.invalidate();
        }
    }
}
