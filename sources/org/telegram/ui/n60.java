package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class n60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f35829a;
    public final q60 f35830b;

    public n60(q60 q60Var, FrameLayout frameLayout) {
        this.f35830b = q60Var;
        this.f35829a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f35829a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        q60 q60Var = this.f35830b;
        if (q60Var.f36619z0 == null) {
            q60Var.f36619z0 = (vc) q60Var.y0(q60Var.Z);
        }
        q60Var.f36619z0.f38547f.setOnClickListener(new i60(this, 1));
    }
}
