package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class m80 implements PopupWindow.OnDismissListener {
    public final ViewGroup f28722a;
    public final q80 f28723b;

    public m80(q80 q80Var, ViewGroup viewGroup) {
        this.f28723b = q80Var;
        this.f28722a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        q80 q80Var = this.f28723b;
        q80Var.f30110m = null;
        q80.a(q80Var, this.f28722a);
        View view2 = q80Var.f30116p0;
        if (view2 != null) {
            view2.setPressed(false);
            q80Var.f30116p0 = null;
        }
        if (q80Var.f30114o0 != null && (view = q80Var.f30097f) != null) {
            view.setOnTouchListener(null);
        }
        q80Var.f30114o0 = null;
        q80Var.N();
        Runnable runnable = q80Var.f30115p;
        if (runnable != null) {
            runnable.run();
            q80Var.f30115p = null;
        }
    }
}
