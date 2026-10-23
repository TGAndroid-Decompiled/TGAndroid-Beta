package org.telegram.ui;

import android.view.View;
public final class m30 extends View {
    public final q50 f39109a;

    public m30(q50 q50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f39109a = q50Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f39109a.T0();
        }
    }
}
