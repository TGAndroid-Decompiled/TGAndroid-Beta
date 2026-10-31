package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class v60 implements PopupWindow.OnDismissListener {
    public final ViewGroup f31152a;
    public final z60 f31153b;

    public v60(z60 z60Var, ViewGroup viewGroup) {
        this.f31153b = z60Var;
        this.f31152a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        z60 z60Var = this.f31153b;
        z60Var.f32931m = null;
        z60.a(z60Var, this.f31152a);
        View view2 = z60Var.f32937p0;
        if (view2 != null) {
            view2.setPressed(false);
            z60Var.f32937p0 = null;
        }
        if (z60Var.f32935o0 != null && (view = z60Var.f32918f) != null) {
            view.setOnTouchListener(null);
        }
        z60Var.f32935o0 = null;
        z60Var.N();
        Runnable runnable = z60Var.f32936p;
        if (runnable != null) {
            runnable.run();
            z60Var.f32936p = null;
        }
    }
}
