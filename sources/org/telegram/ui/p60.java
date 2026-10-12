package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class p60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f40863a;
    public final s60 f40864b;

    public p60(s60 s60Var, FrameLayout frameLayout) {
        this.f40864b = s60Var;
        this.f40863a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f40863a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        s60 s60Var = this.f40864b;
        if (s60Var.f41819z0 == null) {
            s60Var.f41819z0 = (yc) s60Var.y0(s60Var.Z);
        }
        s60Var.f41819z0.f44453f.setOnClickListener(new o60(this, 0));
    }
}
