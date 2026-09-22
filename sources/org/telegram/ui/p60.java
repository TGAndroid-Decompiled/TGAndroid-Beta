package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class p60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f36504a;
    public final s60 f36505b;

    public p60(s60 s60Var, FrameLayout frameLayout) {
        this.f36505b = s60Var;
        this.f36504a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f36504a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        s60 s60Var = this.f36505b;
        if (s60Var.f37327z0 == null) {
            s60Var.f37327z0 = (uc) s60Var.y0(s60Var.Z);
        }
        s60Var.f37327z0.f38056f.setOnClickListener(new k60(this, 1));
    }
}
