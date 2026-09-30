package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class k60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f34951a;
    public final n60 f34952b;

    public k60(n60 n60Var, FrameLayout frameLayout) {
        this.f34952b = n60Var;
        this.f34951a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f34951a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        n60 n60Var = this.f34952b;
        if (n60Var.f35757z0 == null) {
            n60Var.f35757z0 = (tc) n60Var.y0(n60Var.Z);
        }
        n60Var.f35757z0.f38046f.setOnClickListener(new f60(this, 1));
    }
}
