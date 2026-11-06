package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class g60 implements PopupWindow.OnDismissListener {
    public final ViewGroup f33833a;
    public final k60 f33834b;

    public g60(k60 k60Var, ViewGroup viewGroup) {
        this.f33834b = k60Var;
        this.f33833a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        k60 k60Var = this.f33834b;
        k60Var.f35195m = null;
        k60.a(k60Var, this.f33833a);
        View view2 = k60Var.f35201p0;
        if (view2 != null) {
            view2.setPressed(false);
            k60Var.f35201p0 = null;
        }
        if (k60Var.f35199o0 != null && (view = k60Var.f35182f) != null) {
            view.setOnTouchListener(null);
        }
        k60Var.f35199o0 = null;
        k60Var.N();
        Runnable runnable = k60Var.f35200p;
        if (runnable != null) {
            runnable.run();
            k60Var.f35200p = null;
        }
    }
}
