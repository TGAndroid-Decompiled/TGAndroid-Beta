package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class m70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f28994a;
    public final q70 f28995b;

    public m70(q70 q70Var, ViewGroup viewGroup) {
        this.f28995b = q70Var;
        this.f28994a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        q70 q70Var = this.f28995b;
        q70Var.f30323m = null;
        q70.a(q70Var, this.f28994a);
        View view2 = q70Var.f30329p0;
        if (view2 != null) {
            view2.setPressed(false);
            q70Var.f30329p0 = null;
        }
        if (q70Var.f30327o0 != null && (view = q70Var.f30310f) != null) {
            view.setOnTouchListener(null);
        }
        q70Var.f30327o0 = null;
        q70Var.N();
        Runnable runnable = q70Var.f30328p;
        if (runnable != null) {
            runnable.run();
            q70Var.f30328p = null;
        }
    }
}
