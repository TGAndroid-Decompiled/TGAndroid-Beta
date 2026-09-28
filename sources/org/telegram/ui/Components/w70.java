package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class w70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f29845a;
    public final a80 f29846b;

    public w70(a80 a80Var, ViewGroup viewGroup) {
        this.f29846b = a80Var;
        this.f29845a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        a80 a80Var = this.f29846b;
        a80Var.f22593m = null;
        a80.a(a80Var, this.f29845a);
        View view2 = a80Var.f22599p0;
        if (view2 != null) {
            view2.setPressed(false);
            a80Var.f22599p0 = null;
        }
        if (a80Var.f22597o0 != null && (view = a80Var.f22580f) != null) {
            view.setOnTouchListener(null);
        }
        a80Var.f22597o0 = null;
        a80Var.N();
        Runnable runnable = a80Var.f22598p;
        if (runnable != null) {
            runnable.run();
            a80Var.f22598p = null;
        }
    }
}
