package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class s70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f28075a;
    public final w70 f28076b;

    public s70(w70 w70Var, ViewGroup viewGroup) {
        this.f28076b = w70Var;
        this.f28075a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        w70 w70Var = this.f28076b;
        w70Var.f29914m = null;
        w70.a(w70Var, this.f28075a);
        View view2 = w70Var.f29920p0;
        if (view2 != null) {
            view2.setPressed(false);
            w70Var.f29920p0 = null;
        }
        if (w70Var.f29918o0 != null && (view = w70Var.f29901f) != null) {
            view.setOnTouchListener(null);
        }
        w70Var.f29918o0 = null;
        w70Var.N();
        Runnable runnable = w70Var.f29919p;
        if (runnable != null) {
            runnable.run();
            w70Var.f29919p = null;
        }
    }
}
