package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class g60 implements PopupWindow.OnDismissListener {
    public final ViewGroup f33859a;
    public final k60 f33860b;

    public g60(k60 k60Var, ViewGroup viewGroup) {
        this.f33860b = k60Var;
        this.f33859a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        k60 k60Var = this.f33860b;
        k60Var.f35221m = null;
        k60.a(k60Var, this.f33859a);
        View view2 = k60Var.f35227p0;
        if (view2 != null) {
            view2.setPressed(false);
            k60Var.f35227p0 = null;
        }
        if (k60Var.f35225o0 != null && (view = k60Var.f35208f) != null) {
            view.setOnTouchListener(null);
        }
        k60Var.f35225o0 = null;
        k60Var.N();
        Runnable runnable = k60Var.f35226p;
        if (runnable != null) {
            runnable.run();
            k60Var.f35226p = null;
        }
    }
}
