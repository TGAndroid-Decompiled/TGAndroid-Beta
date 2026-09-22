package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class u70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f28687a;
    public final y70 f28688b;

    public u70(y70 y70Var, ViewGroup viewGroup) {
        this.f28688b = y70Var;
        this.f28687a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        y70 y70Var = this.f28688b;
        y70Var.f30558m = null;
        y70.a(y70Var, this.f28687a);
        View view2 = y70Var.f30564p0;
        if (view2 != null) {
            view2.setPressed(false);
            y70Var.f30564p0 = null;
        }
        if (y70Var.f30562o0 != null && (view = y70Var.f30545f) != null) {
            view.setOnTouchListener(null);
        }
        y70Var.f30562o0 = null;
        y70Var.N();
        Runnable runnable = y70Var.f30563p;
        if (runnable != null) {
            runnable.run();
            y70Var.f30563p = null;
        }
    }
}
