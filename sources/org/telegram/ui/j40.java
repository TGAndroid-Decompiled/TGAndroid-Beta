package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class j40 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f46829a;
    public final l40 f46830b;

    public j40(l40 l40Var, FrameLayout frameLayout) {
        this.f46830b = l40Var;
        this.f46829a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f46829a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        l40 l40Var = this.f46830b;
        if (l40Var.f47459z0 == null) {
            l40Var.f47459z0 = (kc) l40Var.F0(l40Var.Z);
        }
        l40Var.f47459z0.f47263f.setOnClickListener(new i40(this, 0));
    }
}
