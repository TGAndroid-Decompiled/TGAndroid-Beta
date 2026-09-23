package org.telegram.ui;

import android.view.View;
public final class c40 extends View {
    public final f60 f32253a;

    public c40(f60 f60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f32253a = f60Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f32253a.S0();
        }
    }
}
