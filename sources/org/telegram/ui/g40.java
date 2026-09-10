package org.telegram.ui;

import android.view.View;
public final class g40 extends View {
    public final j60 f32987a;

    public g40(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f32987a = j60Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f32987a.S0();
        }
    }
}
