package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class n60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f40126a;
    public final q60 f40127b;

    public n60(q60 q60Var, FrameLayout frameLayout) {
        this.f40127b = q60Var;
        this.f40126a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f40126a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        q60 q60Var = this.f40127b;
        if (q60Var.f41073z0 == null) {
            q60Var.f41073z0 = (uc) q60Var.y0(q60Var.Z);
        }
        q60Var.f41073z0.f42444f.setOnClickListener(new m60(this, 0));
    }
}
