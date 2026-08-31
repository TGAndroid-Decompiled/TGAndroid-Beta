package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class m70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f28955a;
    public final q70 f28956b;

    public m70(q70 q70Var, ViewGroup viewGroup) {
        this.f28956b = q70Var;
        this.f28955a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        q70 q70Var = this.f28956b;
        q70Var.f30319m = null;
        q70.a(q70Var, this.f28955a);
        View view2 = q70Var.f30325p0;
        if (view2 != null) {
            view2.setPressed(false);
            q70Var.f30325p0 = null;
        }
        if (q70Var.f30323o0 != null && (view = q70Var.f30306f) != null) {
            view.setOnTouchListener(null);
        }
        q70Var.f30323o0 = null;
        q70Var.N();
        Runnable runnable = q70Var.f30324p;
        if (runnable != null) {
            runnable.run();
            q70Var.f30324p = null;
        }
    }
}
