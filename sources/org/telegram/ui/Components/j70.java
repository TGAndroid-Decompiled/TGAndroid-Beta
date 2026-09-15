package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class j70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f25247a;
    public final n70 f25248b;

    public j70(n70 n70Var, ViewGroup viewGroup) {
        this.f25248b = n70Var;
        this.f25247a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        n70 n70Var = this.f25248b;
        n70Var.f26358m = null;
        n70.a(n70Var, this.f25247a);
        View view2 = n70Var.f26364p0;
        if (view2 != null) {
            view2.setPressed(false);
            n70Var.f26364p0 = null;
        }
        if (n70Var.f26362o0 != null && (view = n70Var.f26345f) != null) {
            view.setOnTouchListener(null);
        }
        n70Var.f26362o0 = null;
        n70Var.N();
        Runnable runnable = n70Var.f26363p;
        if (runnable != null) {
            runnable.run();
            n70Var.f26363p = null;
        }
    }
}
