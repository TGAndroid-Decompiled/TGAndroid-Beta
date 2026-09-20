package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class r70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f27791a;
    public final v70 f27792b;

    public r70(v70 v70Var, ViewGroup viewGroup) {
        this.f27792b = v70Var;
        this.f27791a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        v70 v70Var = this.f27792b;
        v70Var.f28984m = null;
        v70.a(v70Var, this.f27791a);
        View view2 = v70Var.f28990p0;
        if (view2 != null) {
            view2.setPressed(false);
            v70Var.f28990p0 = null;
        }
        if (v70Var.f28988o0 != null && (view = v70Var.f28971f) != null) {
            view.setOnTouchListener(null);
        }
        v70Var.f28988o0 = null;
        v70Var.N();
        Runnable runnable = v70Var.f28989p;
        if (runnable != null) {
            runnable.run();
            v70Var.f28989p = null;
        }
    }
}
