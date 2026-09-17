package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class j70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f25149a;
    public final n70 f25150b;

    public j70(n70 n70Var, ViewGroup viewGroup) {
        this.f25150b = n70Var;
        this.f25149a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        n70 n70Var = this.f25150b;
        n70Var.f26374m = null;
        n70.a(n70Var, this.f25149a);
        View view2 = n70Var.f26380p0;
        if (view2 != null) {
            view2.setPressed(false);
            n70Var.f26380p0 = null;
        }
        if (n70Var.f26378o0 != null && (view = n70Var.f26361f) != null) {
            view.setOnTouchListener(null);
        }
        n70Var.f26378o0 = null;
        n70Var.N();
        Runnable runnable = n70Var.f26379p;
        if (runnable != null) {
            runnable.run();
            n70Var.f26379p = null;
        }
    }
}
