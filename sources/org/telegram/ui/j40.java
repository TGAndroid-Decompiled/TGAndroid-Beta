package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class j40 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f48983a;
    public final l40 f48984b;

    public j40(l40 l40Var, FrameLayout frameLayout) {
        this.f48984b = l40Var;
        this.f48983a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f48983a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        l40 l40Var = this.f48984b;
        if (l40Var.A0 == null) {
            l40Var.A0 = (jc) l40Var.F0(l40Var.f51402a0);
        }
        l40Var.A0.f49089f.setOnClickListener(new i40(this, 0));
    }
}
