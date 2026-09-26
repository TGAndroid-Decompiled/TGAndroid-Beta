package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class k60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f34947a;
    public final n60 f34948b;

    public k60(n60 n60Var, FrameLayout frameLayout) {
        this.f34948b = n60Var;
        this.f34947a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f34947a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        n60 n60Var = this.f34948b;
        if (n60Var.f35752z0 == null) {
            n60Var.f35752z0 = (tc) n60Var.y0(n60Var.Z);
        }
        n60Var.f35752z0.f38045f.setOnClickListener(new f60(this, 1));
    }
}
