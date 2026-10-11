package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class m80 implements PopupWindow.OnDismissListener {
    public final ViewGroup f28602a;
    public final q80 f28603b;

    public m80(q80 q80Var, ViewGroup viewGroup) {
        this.f28603b = q80Var;
        this.f28602a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        q80 q80Var = this.f28603b;
        q80Var.f30073m = null;
        q80.a(q80Var, this.f28602a);
        View view2 = q80Var.f30079p0;
        if (view2 != null) {
            view2.setPressed(false);
            q80Var.f30079p0 = null;
        }
        if (q80Var.f30077o0 != null && (view = q80Var.f30060f) != null) {
            view.setOnTouchListener(null);
        }
        q80Var.f30077o0 = null;
        q80Var.N();
        Runnable runnable = q80Var.f30078p;
        if (runnable != null) {
            runnable.run();
            q80Var.f30078p = null;
        }
    }
}
