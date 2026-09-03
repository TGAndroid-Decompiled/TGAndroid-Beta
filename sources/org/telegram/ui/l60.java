package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class l60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f38549a;
    public final n60 f38550b;

    public l60(n60 n60Var, FrameLayout frameLayout) {
        this.f38550b = n60Var;
        this.f38549a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f38549a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        n60 n60Var = this.f38550b;
        if (n60Var.f39201w0 == null) {
            n60Var.f39201w0 = (tc) n60Var.y0(n60Var.W);
        }
        n60Var.f39201w0.f41506f.setOnClickListener(new f60(this, 1));
    }
}
