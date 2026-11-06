package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class g60 implements PopupWindow.OnDismissListener {
    public final ViewGroup f33869a;
    public final k60 f33870b;

    public g60(k60 k60Var, ViewGroup viewGroup) {
        this.f33870b = k60Var;
        this.f33869a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        k60 k60Var = this.f33870b;
        k60Var.f35206m = null;
        k60.a(k60Var, this.f33869a);
        View view2 = k60Var.f35212p0;
        if (view2 != null) {
            view2.setPressed(false);
            k60Var.f35212p0 = null;
        }
        if (k60Var.f35210o0 != null && (view = k60Var.f35193f) != null) {
            view.setOnTouchListener(null);
        }
        k60Var.f35210o0 = null;
        k60Var.N();
        Runnable runnable = k60Var.f35211p;
        if (runnable != null) {
            runnable.run();
            k60Var.f35211p = null;
        }
    }
}
