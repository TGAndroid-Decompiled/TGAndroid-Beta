package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class c40 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f44232a;
    public final e40 f44233b;

    public c40(e40 e40Var, FrameLayout frameLayout) {
        this.f44233b = e40Var;
        this.f44232a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f44232a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        e40 e40Var = this.f44233b;
        if (e40Var.A0 == null) {
            e40Var.A0 = (ic) e40Var.F0(e40Var.f48511a0);
        }
        e40Var.A0.f46237f.setOnClickListener(new b40(this, 0));
    }
}
