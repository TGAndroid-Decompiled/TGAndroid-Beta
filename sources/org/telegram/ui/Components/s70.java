package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class s70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f26966a;
    public final w70 f26967b;

    public s70(w70 w70Var, ViewGroup viewGroup) {
        this.f26967b = w70Var;
        this.f26966a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        w70 w70Var = this.f26967b;
        w70Var.f28691m = null;
        w70.a(w70Var, this.f26966a);
        View view2 = w70Var.f28697p0;
        if (view2 != null) {
            view2.setPressed(false);
            w70Var.f28697p0 = null;
        }
        if (w70Var.f28695o0 != null && (view = w70Var.f28678f) != null) {
            view.setOnTouchListener(null);
        }
        w70Var.f28695o0 = null;
        w70Var.N();
        Runnable runnable = w70Var.f28696p;
        if (runnable != null) {
            runnable.run();
            w70Var.f28696p = null;
        }
    }
}
