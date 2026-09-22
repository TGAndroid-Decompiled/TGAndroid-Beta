package org.telegram.ui;

import android.view.View;
public final class f40 extends View {
    public final i60 f33492a;

    public f40(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f33492a = i60Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f33492a.S0();
        }
    }
}
