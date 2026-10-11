package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class n60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f40137a;
    public final q60 f40138b;

    public n60(q60 q60Var, FrameLayout frameLayout) {
        this.f40138b = q60Var;
        this.f40137a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f40137a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        q60 q60Var = this.f40138b;
        if (q60Var.f41049z0 == null) {
            q60Var.f41049z0 = (tc) q60Var.y0(q60Var.Z);
        }
        q60Var.f41049z0.f42155f.setOnClickListener(new m60(this, 0));
    }
}
