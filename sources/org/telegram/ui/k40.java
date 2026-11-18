package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class k40 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f49149a;
    public final m40 f49150b;

    public k40(m40 m40Var, FrameLayout frameLayout) {
        this.f49150b = m40Var;
        this.f49149a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f49149a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        m40 m40Var = this.f49150b;
        if (m40Var.A0 == null) {
            m40Var.A0 = (jc) m40Var.F0(m40Var.f51160a0);
        }
        m40Var.A0.f48937f.setOnClickListener(new j40(this, 0));
    }
}
