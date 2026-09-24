package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class u70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f28720a;
    public final y70 f28721b;

    public u70(y70 y70Var, ViewGroup viewGroup) {
        this.f28721b = y70Var;
        this.f28720a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        y70 y70Var = this.f28721b;
        y70Var.f30537m = null;
        y70.a(y70Var, this.f28720a);
        View view2 = y70Var.f30543p0;
        if (view2 != null) {
            view2.setPressed(false);
            y70Var.f30543p0 = null;
        }
        if (y70Var.f30541o0 != null && (view = y70Var.f30524f) != null) {
            view.setOnTouchListener(null);
        }
        y70Var.f30541o0 = null;
        y70Var.N();
        Runnable runnable = y70Var.f30542p;
        if (runnable != null) {
            runnable.run();
            y70Var.f30542p = null;
        }
    }
}
