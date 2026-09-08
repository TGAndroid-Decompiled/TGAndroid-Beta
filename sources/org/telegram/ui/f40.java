package org.telegram.ui;

import android.view.View;
public final class f40 extends View {
    public final j60 f36288a;

    public f40(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f36288a = j60Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f36288a.S0();
        }
    }
}
