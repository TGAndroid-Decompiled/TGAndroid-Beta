package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class l80 implements PopupWindow.OnDismissListener {
    public final ViewGroup f28263a;
    public final p80 f28264b;

    public l80(p80 p80Var, ViewGroup viewGroup) {
        this.f28264b = p80Var;
        this.f28263a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        p80 p80Var = this.f28264b;
        p80Var.f29769m = null;
        p80.a(p80Var, this.f28263a);
        View view2 = p80Var.f29775p0;
        if (view2 != null) {
            view2.setPressed(false);
            p80Var.f29775p0 = null;
        }
        if (p80Var.f29773o0 != null && (view = p80Var.f29756f) != null) {
            view.setOnTouchListener(null);
        }
        p80Var.f29773o0 = null;
        p80Var.N();
        Runnable runnable = p80Var.f29774p;
        if (runnable != null) {
            runnable.run();
            p80Var.f29774p = null;
        }
    }
}
