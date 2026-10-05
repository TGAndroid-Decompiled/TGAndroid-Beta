package org.telegram.ui;

import android.view.View;
public final class f40 extends View {
    public final h60 f36201a;

    public f40(h60 h60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f36201a = h60Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f36201a.S0();
        }
    }
}
