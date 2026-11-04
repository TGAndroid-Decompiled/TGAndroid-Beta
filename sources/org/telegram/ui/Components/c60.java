package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class c60 implements PopupWindow.OnDismissListener {
    public final ViewGroup f32568a;
    public final f60 f32569b;

    public c60(f60 f60Var, ViewGroup viewGroup) {
        this.f32569b = f60Var;
        this.f32568a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        f60 f60Var = this.f32569b;
        f60Var.f33737m = null;
        f60.a(f60Var, this.f32568a);
        View view2 = f60Var.f33743p0;
        if (view2 != null) {
            view2.setPressed(false);
            f60Var.f33743p0 = null;
        }
        if (f60Var.f33741o0 != null && (view = f60Var.f33724f) != null) {
            view.setOnTouchListener(null);
        }
        f60Var.f33741o0 = null;
        f60Var.N();
        Runnable runnable = f60Var.f33742p;
        if (runnable != null) {
            runnable.run();
            f60Var.f33742p = null;
        }
    }
}
