package org.telegram.ui;

import android.view.View;
public final class a40 extends View {
    public final d60 f31983a;

    public a40(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f31983a = d60Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f31983a.S0();
        }
    }
}
