package org.telegram.ui;

import android.view.View;
public final class d20 extends View {
    public final c40 f46292a;

    public d20(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f46292a = c40Var;
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f46292a.U0();
        }
    }
}
