package org.telegram.ui;

import android.view.View;
public final class b40 extends View {
    public final d60 f35349a;

    public b40(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f35349a = d60Var;
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f35349a.S0();
        }
    }
}
