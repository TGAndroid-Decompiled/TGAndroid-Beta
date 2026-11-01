package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class v60 implements PopupWindow.OnDismissListener {
    public final ViewGroup f31193a;
    public final z60 f31194b;

    public v60(z60 z60Var, ViewGroup viewGroup) {
        this.f31194b = z60Var;
        this.f31193a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        z60 z60Var = this.f31194b;
        z60Var.f33034m = null;
        z60.a(z60Var, this.f31193a);
        View view2 = z60Var.f33040p0;
        if (view2 != null) {
            view2.setPressed(false);
            z60Var.f33040p0 = null;
        }
        if (z60Var.f33038o0 != null && (view = z60Var.f33021f) != null) {
            view.setOnTouchListener(null);
        }
        z60Var.f33038o0 = null;
        z60Var.N();
        Runnable runnable = z60Var.f33039p;
        if (runnable != null) {
            runnable.run();
            z60Var.f33039p = null;
        }
    }
}
