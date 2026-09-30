package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class x70 implements PopupWindow.OnDismissListener {
    public final ViewGroup f30151a;
    public final b80 f30152b;

    public x70(b80 b80Var, ViewGroup viewGroup) {
        this.f30152b = b80Var;
        this.f30151a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        b80 b80Var = this.f30152b;
        b80Var.f22862m = null;
        b80.a(b80Var, this.f30151a);
        View view2 = b80Var.f22868p0;
        if (view2 != null) {
            view2.setPressed(false);
            b80Var.f22868p0 = null;
        }
        if (b80Var.f22866o0 != null && (view = b80Var.f22849f) != null) {
            view.setOnTouchListener(null);
        }
        b80Var.f22866o0 = null;
        b80Var.N();
        Runnable runnable = b80Var.f22867p;
        if (runnable != null) {
            runnable.run();
            b80Var.f22867p = null;
        }
    }
}
