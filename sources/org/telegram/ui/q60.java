package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class q60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f35978a;
    public final s60 f35979b;

    public q60(s60 s60Var, FrameLayout frameLayout) {
        this.f35979b = s60Var;
        this.f35978a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f35978a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        s60 s60Var = this.f35979b;
        if (s60Var.f36561z0 == null) {
            s60Var.f36561z0 = (vc) s60Var.y0(s60Var.Z);
        }
        s60Var.f36561z0.f37534f.setOnClickListener(new l60(this, 1));
    }
}
