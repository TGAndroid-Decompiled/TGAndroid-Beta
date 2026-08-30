package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class k70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f26177a;
    public final o70 f26178b;

    public k70(o70 o70Var, ViewGroup viewGroup) {
        this.f26178b = o70Var;
        this.f26177a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        o70 o70Var = this.f26178b;
        o70Var.f27479m = null;
        o70.a(o70Var, this.f26177a);
        View view2 = o70Var.f27485p0;
        if (view2 != null) {
            view2.setPressed(false);
            o70Var.f27485p0 = null;
        }
        if (o70Var.f27483o0 != null && (view = o70Var.f27466f) != null) {
            view.setOnTouchListener(null);
        }
        o70Var.f27483o0 = null;
        o70Var.N();
        Runnable runnable = o70Var.f27484p;
        if (runnable != null) {
            runnable.run();
            o70Var.f27484p = null;
        }
    }
}
