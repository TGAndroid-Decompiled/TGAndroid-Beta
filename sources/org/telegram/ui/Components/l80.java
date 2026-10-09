package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class l80 implements PopupWindow.OnDismissListener {
    public final ViewGroup f28366a;
    public final p80 f28367b;

    public l80(p80 p80Var, ViewGroup viewGroup) {
        this.f28367b = p80Var;
        this.f28366a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        p80 p80Var = this.f28367b;
        p80Var.f29779m = null;
        p80.a(p80Var, this.f28366a);
        View view2 = p80Var.f29785p0;
        if (view2 != null) {
            view2.setPressed(false);
            p80Var.f29785p0 = null;
        }
        if (p80Var.f29783o0 != null && (view = p80Var.f29766f) != null) {
            view.setOnTouchListener(null);
        }
        p80Var.f29783o0 = null;
        p80Var.N();
        Runnable runnable = p80Var.f29784p;
        if (runnable != null) {
            runnable.run();
            p80Var.f29784p = null;
        }
    }
}
