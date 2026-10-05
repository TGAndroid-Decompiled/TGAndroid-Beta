package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class o60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f39106a;
    public final r60 f39107b;

    public o60(r60 r60Var, FrameLayout frameLayout) {
        this.f39107b = r60Var;
        this.f39106a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f39106a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        r60 r60Var = this.f39107b;
        if (r60Var.f39994z0 == null) {
            r60Var.f39994z0 = (vc) r60Var.y0(r60Var.Z);
        }
        r60Var.f39994z0.f41710f.setOnClickListener(new j60(this, 1));
    }
}
