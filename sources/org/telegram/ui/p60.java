package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class p60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f36442a;
    public final s60 f36443b;

    public p60(s60 s60Var, FrameLayout frameLayout) {
        this.f36443b = s60Var;
        this.f36442a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f36442a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        s60 s60Var = this.f36443b;
        if (s60Var.f37260z0 == null) {
            s60Var.f37260z0 = (tc) s60Var.y0(s60Var.Z);
        }
        s60Var.f37260z0.f37643f.setOnClickListener(new k60(this, 1));
    }
}
