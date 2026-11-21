package org.telegram.ui;

import android.view.View;
public final class g20 extends View {
    public final f40 f47919a;

    public g20(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f47919a = f40Var;
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f47919a.V0();
        }
    }
}
