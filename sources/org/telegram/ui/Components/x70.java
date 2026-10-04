package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class x70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f32731a;
    public final b80 f32732b;

    public x70(b80 b80Var, ViewGroup viewGroup) {
        this.f32732b = b80Var;
        this.f32731a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        b80 b80Var = this.f32732b;
        b80Var.f24834m = null;
        b80.a(b80Var, this.f32731a);
        View view2 = b80Var.f24840p0;
        if (view2 != null) {
            view2.setPressed(false);
            b80Var.f24840p0 = null;
        }
        if (b80Var.f24838o0 != null && (view = b80Var.f24821f) != null) {
            view.setOnTouchListener(null);
        }
        b80Var.f24838o0 = null;
        b80Var.N();
        Runnable runnable = b80Var.f24839p;
        if (runnable != null) {
            runnable.run();
            b80Var.f24839p = null;
        }
    }
}
