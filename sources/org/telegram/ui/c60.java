package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class c60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f38273a;
    public final e60 f38274b;

    public c60(e60 e60Var, FrameLayout frameLayout) {
        this.f38274b = e60Var;
        this.f38273a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f38273a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        e60 e60Var = this.f38274b;
        if (e60Var.f39005z0 == null) {
            e60Var.f39005z0 = (uc) e60Var.B0(e60Var.Z);
        }
        e60Var.f39005z0.f44090f.setOnClickListener(new x50(this, 1));
    }
}
