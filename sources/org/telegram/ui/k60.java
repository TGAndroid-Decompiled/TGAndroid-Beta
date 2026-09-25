package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class k60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f34949a;
    public final n60 f34950b;

    public k60(n60 n60Var, FrameLayout frameLayout) {
        this.f34950b = n60Var;
        this.f34949a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f34949a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        n60 n60Var = this.f34950b;
        if (n60Var.f35754z0 == null) {
            n60Var.f35754z0 = (tc) n60Var.y0(n60Var.Z);
        }
        n60Var.f35754z0.f38047f.setOnClickListener(new f60(this, 1));
    }
}
