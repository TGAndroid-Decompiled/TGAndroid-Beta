package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class h40 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f46194a;
    public final j40 f46195b;

    public h40(j40 j40Var, FrameLayout frameLayout) {
        this.f46195b = j40Var;
        this.f46194a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f46194a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        j40 j40Var = this.f46195b;
        if (j40Var.f46812z0 == null) {
            j40Var.f46812z0 = (kc) j40Var.F0(j40Var.Z);
        }
        j40Var.f46812z0.f47143f.setOnClickListener(new g40(this, 0));
    }
}
