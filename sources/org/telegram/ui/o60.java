package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class o60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f39111a;
    public final r60 f39112b;

    public o60(r60 r60Var, FrameLayout frameLayout) {
        this.f39112b = r60Var;
        this.f39111a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f39111a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        r60 r60Var = this.f39112b;
        if (r60Var.f39926z0 == null) {
            r60Var.f39926z0 = (vc) r60Var.y0(r60Var.Z);
        }
        r60Var.f39926z0.f41697f.setOnClickListener(new j60(this, 1));
    }
}
