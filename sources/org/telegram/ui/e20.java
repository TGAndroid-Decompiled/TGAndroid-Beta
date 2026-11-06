package org.telegram.ui;

import android.view.View;
public final class e20 extends View {
    public final c40 f45155a;

    public e20(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f45155a = c40Var;
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f45155a.U0();
        }
    }
}
