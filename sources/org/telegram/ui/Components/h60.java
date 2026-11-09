package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class h60 implements PopupWindow.OnDismissListener {
    public final ViewGroup f34211a;
    public final l60 f34212b;

    public h60(l60 l60Var, ViewGroup viewGroup) {
        this.f34212b = l60Var;
        this.f34211a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        l60 l60Var = this.f34212b;
        l60Var.f35607m = null;
        l60.a(l60Var, this.f34211a);
        View view2 = l60Var.f35613p0;
        if (view2 != null) {
            view2.setPressed(false);
            l60Var.f35613p0 = null;
        }
        if (l60Var.f35611o0 != null && (view = l60Var.f35594f) != null) {
            view.setOnTouchListener(null);
        }
        l60Var.f35611o0 = null;
        l60Var.N();
        Runnable runnable = l60Var.f35612p;
        if (runnable != null) {
            runnable.run();
            l60Var.f35612p = null;
        }
    }
}
