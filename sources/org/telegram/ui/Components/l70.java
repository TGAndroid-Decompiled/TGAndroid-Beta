package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class l70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f26607a;
    public final p70 f26608b;

    public l70(p70 p70Var, ViewGroup viewGroup) {
        this.f26608b = p70Var;
        this.f26607a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        p70 p70Var = this.f26608b;
        p70Var.f27767m = null;
        p70.a(p70Var, this.f26607a);
        View view2 = p70Var.f27773p0;
        if (view2 != null) {
            view2.setPressed(false);
            p70Var.f27773p0 = null;
        }
        if (p70Var.f27771o0 != null && (view = p70Var.f27754f) != null) {
            view.setOnTouchListener(null);
        }
        p70Var.f27771o0 = null;
        p70Var.N();
        Runnable runnable = p70Var.f27772p;
        if (runnable != null) {
            runnable.run();
            p70Var.f27772p = null;
        }
    }
}
