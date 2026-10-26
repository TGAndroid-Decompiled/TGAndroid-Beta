package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class c60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f38276a;
    public final e60 f38277b;

    public c60(e60 e60Var, FrameLayout frameLayout) {
        this.f38277b = e60Var;
        this.f38276a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f38276a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        e60 e60Var = this.f38277b;
        if (e60Var.f39008z0 == null) {
            e60Var.f39008z0 = (uc) e60Var.B0(e60Var.Z);
        }
        e60Var.f39008z0.f44093f.setOnClickListener(new x50(this, 1));
    }
}
