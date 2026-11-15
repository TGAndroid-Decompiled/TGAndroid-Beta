package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class h40 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f47606a;
    public final j40 f47607b;

    public h40(j40 j40Var, FrameLayout frameLayout) {
        this.f47607b = j40Var;
        this.f47606a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f47606a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        j40 j40Var = this.f47607b;
        if (j40Var.A0 == null) {
            j40Var.A0 = (jc) j40Var.F0(j40Var.f50553a0);
        }
        j40Var.A0.f48303f.setOnClickListener(new g40(this, 0));
    }
}
