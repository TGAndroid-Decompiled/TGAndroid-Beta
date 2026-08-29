package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class f70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f28341a;
    public final j70 f28342b;

    public f70(j70 j70Var, ViewGroup viewGroup) {
        this.f28342b = j70Var;
        this.f28341a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        j70 j70Var = this.f28342b;
        j70Var.f29590m = null;
        j70.a(j70Var, this.f28341a);
        View view2 = j70Var.f29596p0;
        if (view2 != null) {
            view2.setPressed(false);
            j70Var.f29596p0 = null;
        }
        if (j70Var.f29594o0 != null && (view = j70Var.f29577f) != null) {
            view.setOnTouchListener(null);
        }
        j70Var.f29594o0 = null;
        j70Var.N();
        Runnable runnable = j70Var.f29595p;
        if (runnable != null) {
            runnable.run();
            j70Var.f29595p = null;
        }
    }
}
