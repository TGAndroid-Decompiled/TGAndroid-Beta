package org.telegram.ui;

import android.view.View;
public final class d30 extends View {
    public final b50 f36604a;

    public d30(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f36604a = b50Var;
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f36604a.U0();
        }
    }
}
