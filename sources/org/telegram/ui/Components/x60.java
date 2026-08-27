package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

public final class x60 implements PopupWindow.OnDismissListener {

    public final ViewGroup f34511a;

    public final b70 f34512b;

    public x60(b70 b70Var, ViewGroup viewGroup) {
        this.f34512b = b70Var;
        this.f34511a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        b70 b70Var = this.f34512b;
        b70Var.f26982m = null;
        b70.a(b70Var, this.f34511a);
        View view2 = b70Var.f26988p0;
        if (view2 != null) {
            view2.setPressed(false);
            b70Var.f26988p0 = null;
        }
        if (b70Var.f26986o0 != null && (view = b70Var.f26969f) != null) {
            view.setOnTouchListener(null);
        }
        b70Var.f26986o0 = null;
        b70Var.N();
        Runnable runnable = b70Var.f26987p;
        if (runnable != null) {
            runnable.run();
            b70Var.f26987p = null;
        }
    }
}
