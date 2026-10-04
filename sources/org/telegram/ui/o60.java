package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class o60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f39110a;
    public final r60 f39111b;

    public o60(r60 r60Var, FrameLayout frameLayout) {
        this.f39111b = r60Var;
        this.f39110a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f39110a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        r60 r60Var = this.f39111b;
        if (r60Var.f39925z0 == null) {
            r60Var.f39925z0 = (vc) r60Var.y0(r60Var.Z);
        }
        r60Var.f39925z0.f41696f.setOnClickListener(new j60(this, 1));
    }
}
