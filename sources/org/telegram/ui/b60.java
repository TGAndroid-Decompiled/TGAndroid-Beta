package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class b60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f35882a;
    public final d60 f35883b;

    public b60(d60 d60Var, FrameLayout frameLayout) {
        this.f35883b = d60Var;
        this.f35882a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f35882a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        d60 d60Var = this.f35883b;
        if (d60Var.f36520z0 == null) {
            d60Var.f36520z0 = (tc) d60Var.A0(d60Var.Z);
        }
        d60Var.f36520z0.f41949f.setOnClickListener(new w50(this, 1));
    }
}
