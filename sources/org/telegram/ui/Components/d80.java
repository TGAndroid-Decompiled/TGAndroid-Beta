package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class d80 implements PopupWindow.OnDismissListener {
    public final ViewGroup f25621a;
    public final h80 f25622b;

    public d80(h80 h80Var, ViewGroup viewGroup) {
        this.f25622b = h80Var;
        this.f25621a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        h80 h80Var = this.f25622b;
        h80Var.f26919m = null;
        h80.a(h80Var, this.f25621a);
        View view2 = h80Var.f26925p0;
        if (view2 != null) {
            view2.setPressed(false);
            h80Var.f26925p0 = null;
        }
        if (h80Var.f26923o0 != null && (view = h80Var.f26906f) != null) {
            view.setOnTouchListener(null);
        }
        h80Var.f26923o0 = null;
        h80Var.N();
        Runnable runnable = h80Var.f26924p;
        if (runnable != null) {
            runnable.run();
            h80Var.f26924p = null;
        }
    }
}
