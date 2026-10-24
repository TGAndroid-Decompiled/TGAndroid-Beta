package org.telegram.ui;

import android.view.View;
public final class p30 extends View {
    public final u50 f40321a;

    public p30(u50 u50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f40321a = u50Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f40321a.S0();
        }
    }
}
