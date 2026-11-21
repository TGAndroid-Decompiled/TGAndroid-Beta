package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class u60 implements PopupWindow.OnDismissListener {
    public final ViewGroup f40279a;
    public final a70 f40280b;

    public u60(a70 a70Var, ViewGroup viewGroup) {
        this.f40280b = a70Var;
        this.f40279a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        a70 a70Var = this.f40280b;
        a70Var.f33373m = null;
        a70.a(a70Var, this.f40279a);
        View view2 = a70Var.f33385s0;
        if (view2 != null) {
            view2.setPressed(false);
            a70Var.f33385s0 = null;
        }
        if (a70Var.f33383r0 != null && (view = a70Var.f33360f) != null) {
            view.setOnTouchListener(null);
        }
        a70Var.f33383r0 = null;
        a70Var.O();
        Runnable runnable = a70Var.f33378p;
        if (runnable != null) {
            runnable.run();
            a70Var.f33378p = null;
        }
    }
}
