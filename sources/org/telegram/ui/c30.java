package org.telegram.ui;

import android.view.View;
public final class c30 extends View {
    public final a50 f36170a;

    public c30(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f36170a = a50Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f36170a.U0();
        }
    }
}
