package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class g80 implements PopupWindow.OnDismissListener {
    public final ViewGroup f28485a;
    public final k80 f28486b;

    public g80(k80 k80Var, ViewGroup viewGroup) {
        this.f28486b = k80Var;
        this.f28485a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        k80 k80Var = this.f28486b;
        k80Var.f29858m = null;
        k80.a(k80Var, this.f28485a);
        View view2 = k80Var.f29864p0;
        if (view2 != null) {
            view2.setPressed(false);
            k80Var.f29864p0 = null;
        }
        if (k80Var.f29862o0 != null && (view = k80Var.f29845f) != null) {
            view.setOnTouchListener(null);
        }
        k80Var.f29862o0 = null;
        k80Var.N();
        Runnable runnable = k80Var.f29863p;
        if (runnable != null) {
            runnable.run();
            k80Var.f29863p = null;
        }
    }
}
