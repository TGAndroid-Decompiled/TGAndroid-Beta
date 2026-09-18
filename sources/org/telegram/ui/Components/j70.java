package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class j70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f25152a;
    public final n70 f25153b;

    public j70(n70 n70Var, ViewGroup viewGroup) {
        this.f25153b = n70Var;
        this.f25152a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        n70 n70Var = this.f25153b;
        n70Var.f26377m = null;
        n70.a(n70Var, this.f25152a);
        View view2 = n70Var.f26383p0;
        if (view2 != null) {
            view2.setPressed(false);
            n70Var.f26383p0 = null;
        }
        if (n70Var.f26381o0 != null && (view = n70Var.f26364f) != null) {
            view.setOnTouchListener(null);
        }
        n70Var.f26381o0 = null;
        n70Var.N();
        Runnable runnable = n70Var.f26382p;
        if (runnable != null) {
            runnable.run();
            n70Var.f26382p = null;
        }
    }
}
