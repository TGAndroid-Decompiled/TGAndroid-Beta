package org.telegram.ui;

import android.view.View;
public final class c40 extends View {
    public final e60 f33014a;

    public c40(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f33014a = e60Var;
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f33014a.S0();
        }
    }
}
