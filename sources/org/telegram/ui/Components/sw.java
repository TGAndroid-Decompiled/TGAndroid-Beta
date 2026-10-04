package org.telegram.ui.Components;

import android.content.Context;
public final class sw extends az {
    public final nz H;

    public sw(nz nzVar, Context context) {
        super(nzVar, context, 2);
        this.H = nzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.f29110g0.invalidate();
        }
    }
}
