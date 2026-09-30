package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class k60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f35038a;
    public final n60 f35039b;

    public k60(n60 n60Var, FrameLayout frameLayout) {
        this.f35039b = n60Var;
        this.f35038a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f35038a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        n60 n60Var = this.f35039b;
        if (n60Var.f35864z0 == null) {
            n60Var.f35864z0 = (tc) n60Var.y0(n60Var.Z);
        }
        n60Var.f35864z0.f38156f.setOnClickListener(new f60(this, 1));
    }
}
