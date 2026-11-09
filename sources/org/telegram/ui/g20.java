package org.telegram.ui;

import android.view.View;
public final class g20 extends View {
    public final e40 f45853a;

    public g20(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f45853a = e40Var;
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f45853a.U0();
        }
    }
}
