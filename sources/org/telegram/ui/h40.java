package org.telegram.ui;

import android.view.View;
public final class h40 extends View {
    public final k60 f34179a;

    public h40(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f34179a = k60Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f34179a.S0();
        }
    }
}
