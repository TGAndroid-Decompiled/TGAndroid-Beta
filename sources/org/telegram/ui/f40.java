package org.telegram.ui;

import android.view.View;
public final class f40 extends View {
    public final i60 f33510a;

    public f40(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f33510a = i60Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f33510a.S0();
        }
    }
}
