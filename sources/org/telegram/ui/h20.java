package org.telegram.ui;

import android.view.View;
public final class h20 extends View {
    public final f40 f46212a;

    public h20(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f46212a = f40Var;
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f46212a.U0();
        }
    }
}
