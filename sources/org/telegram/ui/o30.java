package org.telegram.ui;

import android.view.View;
public final class o30 extends View {
    public final s50 f39663a;

    public o30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f39663a = s50Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f39663a.T0();
        }
    }
}
