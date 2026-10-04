package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class x70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f32738a;
    public final b80 f32739b;

    public x70(b80 b80Var, ViewGroup viewGroup) {
        this.f32739b = b80Var;
        this.f32738a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        b80 b80Var = this.f32739b;
        b80Var.f24839m = null;
        b80.a(b80Var, this.f32738a);
        View view2 = b80Var.f24845p0;
        if (view2 != null) {
            view2.setPressed(false);
            b80Var.f24845p0 = null;
        }
        if (b80Var.f24843o0 != null && (view = b80Var.f24826f) != null) {
            view.setOnTouchListener(null);
        }
        b80Var.f24843o0 = null;
        b80Var.N();
        Runnable runnable = b80Var.f24844p;
        if (runnable != null) {
            runnable.run();
            b80Var.f24844p = null;
        }
    }
}
