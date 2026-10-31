package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class g50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f37426a;
    public final i50 f37427b;

    public g50(i50 i50Var, FrameLayout frameLayout) {
        this.f37427b = i50Var;
        this.f37426a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f37426a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        i50 i50Var = this.f37427b;
        if (i50Var.f38178z0 == null) {
            i50Var.f38178z0 = (sc) i50Var.E0(i50Var.Z);
        }
        i50Var.f38178z0.f41469f.setOnClickListener(new f50(this, 0));
    }
}
