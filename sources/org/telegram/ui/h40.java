package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class h40 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f46214a;
    public final j40 f46215b;

    public h40(j40 j40Var, FrameLayout frameLayout) {
        this.f46215b = j40Var;
        this.f46214a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f46214a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        j40 j40Var = this.f46215b;
        if (j40Var.f46836z0 == null) {
            j40Var.f46836z0 = (kc) j40Var.F0(j40Var.Z);
        }
        j40Var.f46836z0.f47166f.setOnClickListener(new g40(this, 0));
    }
}
