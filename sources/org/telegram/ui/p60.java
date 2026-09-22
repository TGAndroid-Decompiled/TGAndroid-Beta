package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class p60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f36454a;
    public final s60 f36455b;

    public p60(s60 s60Var, FrameLayout frameLayout) {
        this.f36455b = s60Var;
        this.f36454a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f36454a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        s60 s60Var = this.f36455b;
        if (s60Var.f37277z0 == null) {
            s60Var.f37277z0 = (tc) s60Var.y0(s60Var.Z);
        }
        s60Var.f37277z0.f37633f.setOnClickListener(new k60(this, 1));
    }
}
