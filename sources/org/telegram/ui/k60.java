package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class k60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f35579a;
    public final m60 f35580b;

    public k60(m60 m60Var, FrameLayout frameLayout) {
        this.f35580b = m60Var;
        this.f35579a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f35579a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        m60 m60Var = this.f35580b;
        if (m60Var.f36199w0 == null) {
            m60Var.f36199w0 = (uc) m60Var.y0(m60Var.W);
        }
        m60Var.f36199w0.f38905f.setOnClickListener(new e60(this, 1));
    }
}
