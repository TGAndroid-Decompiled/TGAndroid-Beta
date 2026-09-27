package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class w70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f29863a;
    public final a80 f29864b;

    public w70(a80 a80Var, ViewGroup viewGroup) {
        this.f29864b = a80Var;
        this.f29863a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        a80 a80Var = this.f29864b;
        a80Var.f22596m = null;
        a80.a(a80Var, this.f29863a);
        View view2 = a80Var.f22602p0;
        if (view2 != null) {
            view2.setPressed(false);
            a80Var.f22602p0 = null;
        }
        if (a80Var.f22600o0 != null && (view = a80Var.f22583f) != null) {
            view.setOnTouchListener(null);
        }
        a80Var.f22600o0 = null;
        a80Var.N();
        Runnable runnable = a80Var.f22601p;
        if (runnable != null) {
            runnable.run();
            a80Var.f22601p = null;
        }
    }
}
