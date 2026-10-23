package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class f80 implements PopupWindow.OnDismissListener {
    public final ViewGroup f26228a;
    public final j80 f26229b;

    public f80(j80 j80Var, ViewGroup viewGroup) {
        this.f26229b = j80Var;
        this.f26228a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        j80 j80Var = this.f26229b;
        j80Var.f27570m = null;
        j80.a(j80Var, this.f26228a);
        View view2 = j80Var.f27576p0;
        if (view2 != null) {
            view2.setPressed(false);
            j80Var.f27576p0 = null;
        }
        if (j80Var.f27574o0 != null && (view = j80Var.f27557f) != null) {
            view.setOnTouchListener(null);
        }
        j80Var.f27574o0 = null;
        j80Var.N();
        Runnable runnable = j80Var.f27575p;
        if (runnable != null) {
            runnable.run();
            j80Var.f27575p = null;
        }
    }
}
