package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class u60 implements PopupWindow.OnDismissListener {
    public final ViewGroup f40272a;
    public final a70 f40273b;

    public u60(a70 a70Var, ViewGroup viewGroup) {
        this.f40273b = a70Var;
        this.f40272a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        a70 a70Var = this.f40273b;
        a70Var.f33386m = null;
        a70.a(a70Var, this.f40272a);
        View view2 = a70Var.f33398s0;
        if (view2 != null) {
            view2.setPressed(false);
            a70Var.f33398s0 = null;
        }
        if (a70Var.f33396r0 != null && (view = a70Var.f33373f) != null) {
            view.setOnTouchListener(null);
        }
        a70Var.f33396r0 = null;
        a70Var.O();
        Runnable runnable = a70Var.f33391p;
        if (runnable != null) {
            runnable.run();
            a70Var.f33391p = null;
        }
    }
}
