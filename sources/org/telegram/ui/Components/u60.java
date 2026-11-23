package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class u60 implements PopupWindow.OnDismissListener {
    public final ViewGroup f40254a;
    public final a70 f40255b;

    public u60(a70 a70Var, ViewGroup viewGroup) {
        this.f40255b = a70Var;
        this.f40254a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        a70 a70Var = this.f40255b;
        a70Var.f33352m = null;
        a70.a(a70Var, this.f40254a);
        View view2 = a70Var.f33364s0;
        if (view2 != null) {
            view2.setPressed(false);
            a70Var.f33364s0 = null;
        }
        if (a70Var.f33362r0 != null && (view = a70Var.f33339f) != null) {
            view.setOnTouchListener(null);
        }
        a70Var.f33362r0 = null;
        a70Var.O();
        Runnable runnable = a70Var.f33357p;
        if (runnable != null) {
            runnable.run();
            a70Var.f33357p = null;
        }
    }
}
