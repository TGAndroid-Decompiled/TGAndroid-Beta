package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class o60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f39116a;
    public final r60 f39117b;

    public o60(r60 r60Var, FrameLayout frameLayout) {
        this.f39117b = r60Var;
        this.f39116a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f39116a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        r60 r60Var = this.f39117b;
        if (r60Var.f39931z0 == null) {
            r60Var.f39931z0 = (vc) r60Var.y0(r60Var.Z);
        }
        r60Var.f39931z0.f41704f.setOnClickListener(new j60(this, 1));
    }
}
