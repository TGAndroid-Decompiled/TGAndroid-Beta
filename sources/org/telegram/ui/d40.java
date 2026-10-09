package org.telegram.ui;

import android.view.View;
public final class d40 extends View {
    public final g60 f36833a;

    public d40(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f36833a = g60Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f36833a.T0();
        }
    }
}
