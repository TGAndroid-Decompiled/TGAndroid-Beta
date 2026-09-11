package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class q60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f39743a;
    public final t60 f39744b;

    public q60(t60 t60Var, FrameLayout frameLayout) {
        this.f39744b = t60Var;
        this.f39743a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f39743a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        t60 t60Var = this.f39744b;
        if (t60Var.f40634z0 == null) {
            t60Var.f40634z0 = (uc) t60Var.y0(t60Var.Z);
        }
        t60Var.f40634z0.f41062f.setOnClickListener(new l60(this, 1));
    }
}
