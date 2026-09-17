package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class q60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f39771a;
    public final t60 f39772b;

    public q60(t60 t60Var, FrameLayout frameLayout) {
        this.f39772b = t60Var;
        this.f39771a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f39771a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        t60 t60Var = this.f39772b;
        if (t60Var.f40662z0 == null) {
            t60Var.f40662z0 = (uc) t60Var.y0(t60Var.Z);
        }
        t60Var.f40662z0.f41090f.setOnClickListener(new l60(this, 1));
    }
}
