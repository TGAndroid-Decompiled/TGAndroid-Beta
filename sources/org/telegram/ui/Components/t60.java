package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class t60 implements PopupWindow.OnDismissListener {
    public final ViewGroup f32632a;
    public final x60 f32633b;

    public t60(x60 x60Var, ViewGroup viewGroup) {
        this.f32633b = x60Var;
        this.f32632a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        x60 x60Var = this.f32633b;
        x60Var.f34570m = null;
        x60.a(x60Var, this.f32632a);
        View view2 = x60Var.f34576p0;
        if (view2 != null) {
            view2.setPressed(false);
            x60Var.f34576p0 = null;
        }
        if (x60Var.f34574o0 != null && (view = x60Var.f34557f) != null) {
            view.setOnTouchListener(null);
        }
        x60Var.f34574o0 = null;
        x60Var.N();
        Runnable runnable = x60Var.f34575p;
        if (runnable != null) {
            runnable.run();
            x60Var.f34575p = null;
        }
    }
}
