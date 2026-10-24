package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class b60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f35931a;
    public final d60 f35932b;

    public b60(d60 d60Var, FrameLayout frameLayout) {
        this.f35932b = d60Var;
        this.f35931a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f35931a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        d60 d60Var = this.f35932b;
        if (d60Var.f36486z0 == null) {
            d60Var.f36486z0 = (tc) d60Var.A0(d60Var.Z);
        }
        d60Var.f36486z0.f41992f.setOnClickListener(new w50(this, 1));
    }
}
