package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class p60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f40861a;
    public final s60 f40862b;

    public p60(s60 s60Var, FrameLayout frameLayout) {
        this.f40862b = s60Var;
        this.f40861a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f40861a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        s60 s60Var = this.f40862b;
        if (s60Var.f41819z0 == null) {
            s60Var.f41819z0 = (yc) s60Var.y0(s60Var.Z);
        }
        s60Var.f41819z0.f44448f.setOnClickListener(new o60(this, 0));
    }
}
