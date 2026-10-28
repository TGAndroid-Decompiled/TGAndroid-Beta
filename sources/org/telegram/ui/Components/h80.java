package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class h80 implements PopupWindow.OnDismissListener {
    public final ViewGroup f28912a;
    public final l80 f28913b;

    public h80(l80 l80Var, ViewGroup viewGroup) {
        this.f28913b = l80Var;
        this.f28912a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        l80 l80Var = this.f28913b;
        l80Var.f30158m = null;
        l80.a(l80Var, this.f28912a);
        View view2 = l80Var.f30164p0;
        if (view2 != null) {
            view2.setPressed(false);
            l80Var.f30164p0 = null;
        }
        if (l80Var.f30162o0 != null && (view = l80Var.f30145f) != null) {
            view.setOnTouchListener(null);
        }
        l80Var.f30162o0 = null;
        l80Var.N();
        Runnable runnable = l80Var.f30163p;
        if (runnable != null) {
            runnable.run();
            l80Var.f30163p = null;
        }
    }
}
