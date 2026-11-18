package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class s60 implements PopupWindow.OnDismissListener {
    public final ViewGroup f39503a;
    public final y60 f39504b;

    public s60(y60 y60Var, ViewGroup viewGroup) {
        this.f39504b = y60Var;
        this.f39503a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        y60 y60Var = this.f39504b;
        y60Var.f42364m = null;
        y60.a(y60Var, this.f39503a);
        View view2 = y60Var.f42376s0;
        if (view2 != null) {
            view2.setPressed(false);
            y60Var.f42376s0 = null;
        }
        if (y60Var.f42374r0 != null && (view = y60Var.f42351f) != null) {
            view.setOnTouchListener(null);
        }
        y60Var.f42374r0 = null;
        y60Var.O();
        Runnable runnable = y60Var.f42369p;
        if (runnable != null) {
            runnable.run();
            y60Var.f42369p = null;
        }
    }
}
