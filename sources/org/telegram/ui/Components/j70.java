package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class j70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f25244a;
    public final n70 f25245b;

    public j70(n70 n70Var, ViewGroup viewGroup) {
        this.f25245b = n70Var;
        this.f25244a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        n70 n70Var = this.f25245b;
        n70Var.f26357m = null;
        n70.a(n70Var, this.f25244a);
        View view2 = n70Var.f26363p0;
        if (view2 != null) {
            view2.setPressed(false);
            n70Var.f26363p0 = null;
        }
        if (n70Var.f26361o0 != null && (view = n70Var.f26344f) != null) {
            view.setOnTouchListener(null);
        }
        n70Var.f26361o0 = null;
        n70Var.N();
        Runnable runnable = n70Var.f26362p;
        if (runnable != null) {
            runnable.run();
            n70Var.f26362p = null;
        }
    }
}
