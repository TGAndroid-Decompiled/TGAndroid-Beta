package org.telegram.ui;

import android.view.View;
public final class o30 extends View {
    public final s50 f39655a;

    public o30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f39655a = s50Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f39655a.T0();
        }
    }
}
