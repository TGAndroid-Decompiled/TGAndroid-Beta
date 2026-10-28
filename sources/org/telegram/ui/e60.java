package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class e60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f38764a;
    public final g60 f38765b;

    public e60(g60 g60Var, FrameLayout frameLayout) {
        this.f38765b = g60Var;
        this.f38764a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f38764a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        g60 g60Var = this.f38765b;
        if (g60Var.f39515z0 == null) {
            g60Var.f39515z0 = (uc) g60Var.B0(g60Var.Z);
        }
        g60Var.f39515z0.f43984f.setOnClickListener(new z50(this, 1));
    }
}
