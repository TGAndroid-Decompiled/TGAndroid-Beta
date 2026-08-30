package org.telegram.ui;

import android.view.View;
public final class a40 extends View {
    public final c60 f32456a;

    public a40(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f32456a = c60Var;
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f32456a.S0();
        }
    }
}
