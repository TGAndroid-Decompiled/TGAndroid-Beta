package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class j70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f27370a;
    public final n70 f27371b;

    public j70(n70 n70Var, ViewGroup viewGroup) {
        this.f27371b = n70Var;
        this.f27370a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        n70 n70Var = this.f27371b;
        n70Var.f28651m = null;
        n70.a(n70Var, this.f27370a);
        View view2 = n70Var.f28657p0;
        if (view2 != null) {
            view2.setPressed(false);
            n70Var.f28657p0 = null;
        }
        if (n70Var.f28655o0 != null && (view = n70Var.f28638f) != null) {
            view.setOnTouchListener(null);
        }
        n70Var.f28655o0 = null;
        n70Var.N();
        Runnable runnable = n70Var.f28656p;
        if (runnable != null) {
            runnable.run();
            n70Var.f28656p = null;
        }
    }
}
