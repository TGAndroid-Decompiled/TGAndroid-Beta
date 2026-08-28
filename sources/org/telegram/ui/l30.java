package org.telegram.ui;

import android.view.View;
public final class l30 extends View {
    public final o50 f39986a;

    public l30(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f39986a = o50Var;
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f39986a.S0();
        }
    }
}
