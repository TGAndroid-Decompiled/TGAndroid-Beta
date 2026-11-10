package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class k40 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f47156a;
    public final m40 f47157b;

    public k40(m40 m40Var, FrameLayout frameLayout) {
        this.f47157b = m40Var;
        this.f47156a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f47156a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        m40 m40Var = this.f47157b;
        if (m40Var.f47788z0 == null) {
            m40Var.f47788z0 = (kc) m40Var.F0(m40Var.Z);
        }
        m40Var.f47788z0.f47255f.setOnClickListener(new j40(this, 0));
    }
}
