package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class r60 implements PopupWindow.OnDismissListener {
    public final ViewGroup f39222a;
    public final x60 f39223b;

    public r60(x60 x60Var, ViewGroup viewGroup) {
        this.f39223b = x60Var;
        this.f39222a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        x60 x60Var = this.f39223b;
        x60Var.f41881m = null;
        x60.a(x60Var, this.f39222a);
        View view2 = x60Var.f41893s0;
        if (view2 != null) {
            view2.setPressed(false);
            x60Var.f41893s0 = null;
        }
        if (x60Var.f41891r0 != null && (view = x60Var.f41868f) != null) {
            view.setOnTouchListener(null);
        }
        x60Var.f41891r0 = null;
        x60Var.O();
        Runnable runnable = x60Var.f41886p;
        if (runnable != null) {
            runnable.run();
            x60Var.f41886p = null;
        }
    }
}
