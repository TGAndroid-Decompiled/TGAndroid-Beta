package org.telegram.ui;

import android.view.View;
public final class j40 extends View {
    public final n60 f37254a;

    public j40(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f37254a = n60Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f37254a.T0();
        }
    }
}
