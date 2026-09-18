package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class p60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f36349a;
    public final s60 f36350b;

    public p60(s60 s60Var, FrameLayout frameLayout) {
        this.f36350b = s60Var;
        this.f36349a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f36349a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        s60 s60Var = this.f36350b;
        if (s60Var.f37204z0 == null) {
            s60Var.f37204z0 = (uc) s60Var.y0(s60Var.Z);
        }
        s60Var.f37204z0.f37963f.setOnClickListener(new k60(this, 1));
    }
}
