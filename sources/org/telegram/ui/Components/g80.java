package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class g80 implements PopupWindow.OnDismissListener {
    public final ViewGroup f28483a;
    public final k80 f28484b;

    public g80(k80 k80Var, ViewGroup viewGroup) {
        this.f28484b = k80Var;
        this.f28483a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        k80 k80Var = this.f28484b;
        k80Var.f29856m = null;
        k80.a(k80Var, this.f28483a);
        View view2 = k80Var.f29862p0;
        if (view2 != null) {
            view2.setPressed(false);
            k80Var.f29862p0 = null;
        }
        if (k80Var.f29860o0 != null && (view = k80Var.f29843f) != null) {
            view.setOnTouchListener(null);
        }
        k80Var.f29860o0 = null;
        k80Var.N();
        Runnable runnable = k80Var.f29861p;
        if (runnable != null) {
            runnable.run();
            k80Var.f29861p = null;
        }
    }
}
