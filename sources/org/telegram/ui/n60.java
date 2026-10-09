package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class n60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f40080a;
    public final q60 f40081b;

    public n60(q60 q60Var, FrameLayout frameLayout) {
        this.f40081b = q60Var;
        this.f40080a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f40080a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        q60 q60Var = this.f40081b;
        if (q60Var.f41027z0 == null) {
            q60Var.f41027z0 = (uc) q60Var.y0(q60Var.Z);
        }
        q60Var.f41027z0.f42398f.setOnClickListener(new m60(this, 0));
    }
}
