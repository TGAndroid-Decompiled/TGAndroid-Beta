package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class w70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f29841a;
    public final a80 f29842b;

    public w70(a80 a80Var, ViewGroup viewGroup) {
        this.f29842b = a80Var;
        this.f29841a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        a80 a80Var = this.f29842b;
        a80Var.f22594m = null;
        a80.a(a80Var, this.f29841a);
        View view2 = a80Var.f22600p0;
        if (view2 != null) {
            view2.setPressed(false);
            a80Var.f22600p0 = null;
        }
        if (a80Var.f22598o0 != null && (view = a80Var.f22581f) != null) {
            view.setOnTouchListener(null);
        }
        a80Var.f22598o0 = null;
        a80Var.N();
        Runnable runnable = a80Var.f22599p;
        if (runnable != null) {
            runnable.run();
            a80Var.f22599p = null;
        }
    }
}
