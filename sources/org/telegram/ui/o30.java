package org.telegram.ui;

import android.view.View;
public final class o30 extends View {
    public final r50 f40967a;

    public o30(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f40967a = r50Var;
    }

    @Override
    public final void setAlpha(float f9) {
        if (getAlpha() != f9) {
            super.setAlpha(f9);
            this.f40967a.S0();
        }
    }
}
