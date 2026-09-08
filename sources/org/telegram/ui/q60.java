package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class q60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f39770a;
    public final t60 f39771b;

    public q60(t60 t60Var, FrameLayout frameLayout) {
        this.f39771b = t60Var;
        this.f39770a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f39770a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        t60 t60Var = this.f39771b;
        if (t60Var.f40661z0 == null) {
            t60Var.f40661z0 = (uc) t60Var.y0(t60Var.Z);
        }
        t60Var.f40661z0.f41089f.setOnClickListener(new l60(this, 1));
    }
}
