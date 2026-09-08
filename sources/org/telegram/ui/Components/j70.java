package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class j70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f27396a;
    public final n70 f27397b;

    public j70(n70 n70Var, ViewGroup viewGroup) {
        this.f27397b = n70Var;
        this.f27396a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        n70 n70Var = this.f27397b;
        n70Var.f28677m = null;
        n70.a(n70Var, this.f27396a);
        View view2 = n70Var.f28683p0;
        if (view2 != null) {
            view2.setPressed(false);
            n70Var.f28683p0 = null;
        }
        if (n70Var.f28681o0 != null && (view = n70Var.f28664f) != null) {
            view.setOnTouchListener(null);
        }
        n70Var.f28681o0 = null;
        n70Var.N();
        Runnable runnable = n70Var.f28682p;
        if (runnable != null) {
            runnable.run();
            n70Var.f28682p = null;
        }
    }
}
