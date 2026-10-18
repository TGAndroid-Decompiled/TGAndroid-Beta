package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class e80 implements PopupWindow.OnDismissListener {
    public final ViewGroup f25876a;
    public final i80 f25877b;

    public e80(i80 i80Var, ViewGroup viewGroup) {
        this.f25877b = i80Var;
        this.f25876a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        i80 i80Var = this.f25877b;
        i80Var.f27131m = null;
        i80.a(i80Var, this.f25876a);
        View view2 = i80Var.f27137p0;
        if (view2 != null) {
            view2.setPressed(false);
            i80Var.f27137p0 = null;
        }
        if (i80Var.f27135o0 != null && (view = i80Var.f27118f) != null) {
            view.setOnTouchListener(null);
        }
        i80Var.f27135o0 = null;
        i80Var.N();
        Runnable runnable = i80Var.f27136p;
        if (runnable != null) {
            runnable.run();
            i80Var.f27136p = null;
        }
    }
}
