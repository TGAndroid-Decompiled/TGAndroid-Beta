package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class o80 implements PopupWindow.OnDismissListener {
    public final ViewGroup f29085a;
    public final s80 f29086b;

    public o80(s80 s80Var, ViewGroup viewGroup) {
        this.f29086b = s80Var;
        this.f29085a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        s80 s80Var = this.f29086b;
        s80Var.f30462m = null;
        s80.a(s80Var, this.f29085a);
        View view2 = s80Var.f30468p0;
        if (view2 != null) {
            view2.setPressed(false);
            s80Var.f30468p0 = null;
        }
        if (s80Var.f30466o0 != null && (view = s80Var.f30449f) != null) {
            view.setOnTouchListener(null);
        }
        s80Var.f30466o0 = null;
        s80Var.N();
        Runnable runnable = s80Var.f30467p;
        if (runnable != null) {
            runnable.run();
            s80Var.f30467p = null;
        }
    }
}
