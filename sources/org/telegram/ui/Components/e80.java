package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class e80 implements PopupWindow.OnDismissListener {
    public final ViewGroup f25847a;
    public final i80 f25848b;

    public e80(i80 i80Var, ViewGroup viewGroup) {
        this.f25848b = i80Var;
        this.f25847a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        i80 i80Var = this.f25848b;
        i80Var.f27124m = null;
        i80.a(i80Var, this.f25847a);
        View view2 = i80Var.f27130p0;
        if (view2 != null) {
            view2.setPressed(false);
            i80Var.f27130p0 = null;
        }
        if (i80Var.f27128o0 != null && (view = i80Var.f27111f) != null) {
            view.setOnTouchListener(null);
        }
        i80Var.f27128o0 = null;
        i80Var.N();
        Runnable runnable = i80Var.f27129p;
        if (runnable != null) {
            runnable.run();
            i80Var.f27129p = null;
        }
    }
}
