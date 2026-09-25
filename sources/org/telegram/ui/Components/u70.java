package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class u70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f28734a;
    public final y70 f28735b;

    public u70(y70 y70Var, ViewGroup viewGroup) {
        this.f28735b = y70Var;
        this.f28734a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        y70 y70Var = this.f28735b;
        y70Var.f30545m = null;
        y70.a(y70Var, this.f28734a);
        View view2 = y70Var.f30551p0;
        if (view2 != null) {
            view2.setPressed(false);
            y70Var.f30551p0 = null;
        }
        if (y70Var.f30549o0 != null && (view = y70Var.f30532f) != null) {
            view.setOnTouchListener(null);
        }
        y70Var.f30549o0 = null;
        y70Var.N();
        Runnable runnable = y70Var.f30550p;
        if (runnable != null) {
            runnable.run();
            y70Var.f30550p = null;
        }
    }
}
