package org.telegram.ui.Components;

import android.content.Context;
public final class qw extends xy {
    public final kz H;

    public qw(kz kzVar, Context context) {
        super(kzVar, context, 2);
        this.H = kzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.f27945g0.invalidate();
        }
    }
}
