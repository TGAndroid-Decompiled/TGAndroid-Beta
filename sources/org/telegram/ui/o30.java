package org.telegram.ui;

import android.view.View;

public final class o30 extends View {

    public final s50 f40982a;

    public o30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f40982a = s50Var;
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f40982a.S0();
        }
    }
}
