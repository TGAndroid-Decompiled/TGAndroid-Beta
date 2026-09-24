package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class k60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f34935a;
    public final n60 f34936b;

    public k60(n60 n60Var, FrameLayout frameLayout) {
        this.f34936b = n60Var;
        this.f34935a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f34935a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        n60 n60Var = this.f34936b;
        if (n60Var.f35740z0 == null) {
            n60Var.f35740z0 = (tc) n60Var.y0(n60Var.Z);
        }
        n60Var.f35740z0.f38029f.setOnClickListener(new f60(this, 1));
    }
}
