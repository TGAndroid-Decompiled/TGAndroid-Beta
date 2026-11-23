package org.telegram.ui;

import android.view.View;
public final class f20 extends View {
    public final e40 f47669a;

    public f20(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f47669a = e40Var;
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f47669a.V0();
        }
    }
}
