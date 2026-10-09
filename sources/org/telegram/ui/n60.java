package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class n60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f40082a;
    public final q60 f40083b;

    public n60(q60 q60Var, FrameLayout frameLayout) {
        this.f40083b = q60Var;
        this.f40082a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f40082a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        q60 q60Var = this.f40083b;
        if (q60Var.f41029z0 == null) {
            q60Var.f41029z0 = (uc) q60Var.y0(q60Var.Z);
        }
        q60Var.f41029z0.f42400f.setOnClickListener(new m60(this, 0));
    }
}
