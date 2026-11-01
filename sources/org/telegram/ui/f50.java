package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class f50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f37000a;
    public final h50 f37001b;

    public f50(h50 h50Var, FrameLayout frameLayout) {
        this.f37001b = h50Var;
        this.f37000a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f37000a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        h50 h50Var = this.f37001b;
        if (h50Var.f37704z0 == null) {
            h50Var.f37704z0 = (sc) h50Var.F0(h50Var.Z);
        }
        h50Var.f37704z0.f41340f.setOnClickListener(new e50(this, 0));
    }
}
