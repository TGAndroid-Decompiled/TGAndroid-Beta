package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class h80 implements PopupWindow.OnDismissListener {
    public final ViewGroup f25201a;
    public final l80 f25202b;

    public h80(l80 l80Var, ViewGroup viewGroup) {
        this.f25202b = l80Var;
        this.f25201a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        l80 l80Var = this.f25202b;
        l80Var.f26658m = null;
        l80.a(l80Var, this.f25201a);
        View view2 = l80Var.f26664p0;
        if (view2 != null) {
            view2.setPressed(false);
            l80Var.f26664p0 = null;
        }
        if (l80Var.f26662o0 != null && (view = l80Var.f26645f) != null) {
            view.setOnTouchListener(null);
        }
        l80Var.f26662o0 = null;
        l80Var.N();
        Runnable runnable = l80Var.f26663p;
        if (runnable != null) {
            runnable.run();
            l80Var.f26663p = null;
        }
    }
}
