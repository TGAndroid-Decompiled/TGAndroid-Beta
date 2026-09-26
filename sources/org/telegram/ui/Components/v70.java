package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class v70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f29016a;
    public final z70 f29017b;

    public v70(z70 z70Var, ViewGroup viewGroup) {
        this.f29017b = z70Var;
        this.f29016a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        z70 z70Var = this.f29017b;
        z70Var.f30829m = null;
        z70.a(z70Var, this.f29016a);
        View view2 = z70Var.f30835p0;
        if (view2 != null) {
            view2.setPressed(false);
            z70Var.f30835p0 = null;
        }
        if (z70Var.f30833o0 != null && (view = z70Var.f30816f) != null) {
            view.setOnTouchListener(null);
        }
        z70Var.f30833o0 = null;
        z70Var.N();
        Runnable runnable = z70Var.f30834p;
        if (runnable != null) {
            runnable.run();
            z70Var.f30834p = null;
        }
    }
}
