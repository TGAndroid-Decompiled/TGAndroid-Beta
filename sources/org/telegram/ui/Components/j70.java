package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class j70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f27397a;
    public final n70 f27398b;

    public j70(n70 n70Var, ViewGroup viewGroup) {
        this.f27398b = n70Var;
        this.f27397a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        n70 n70Var = this.f27398b;
        n70Var.f28678m = null;
        n70.a(n70Var, this.f27397a);
        View view2 = n70Var.f28684p0;
        if (view2 != null) {
            view2.setPressed(false);
            n70Var.f28684p0 = null;
        }
        if (n70Var.f28682o0 != null && (view = n70Var.f28665f) != null) {
            view.setOnTouchListener(null);
        }
        n70Var.f28682o0 = null;
        n70Var.N();
        Runnable runnable = n70Var.f28683p;
        if (runnable != null) {
            runnable.run();
            n70Var.f28683p = null;
        }
    }
}
