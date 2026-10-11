package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class n60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f40171a;
    public final q60 f40172b;

    public n60(q60 q60Var, FrameLayout frameLayout) {
        this.f40172b = q60Var;
        this.f40171a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f40171a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        q60 q60Var = this.f40172b;
        if (q60Var.f41083z0 == null) {
            q60Var.f41083z0 = (tc) q60Var.y0(q60Var.Z);
        }
        q60Var.f41083z0.f42189f.setOnClickListener(new m60(this, 0));
    }
}
