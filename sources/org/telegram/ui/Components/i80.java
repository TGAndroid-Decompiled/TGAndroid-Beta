package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class i80 implements PopupWindow.OnDismissListener {
    public final ViewGroup f25911a;
    public final m80 f25912b;

    public i80(m80 m80Var, ViewGroup viewGroup) {
        this.f25912b = m80Var;
        this.f25911a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        m80 m80Var = this.f25912b;
        m80Var.f27288m = null;
        m80.a(m80Var, this.f25911a);
        View view2 = m80Var.f27294p0;
        if (view2 != null) {
            view2.setPressed(false);
            m80Var.f27294p0 = null;
        }
        if (m80Var.f27292o0 != null && (view = m80Var.f27275f) != null) {
            view.setOnTouchListener(null);
        }
        m80Var.f27292o0 = null;
        m80Var.N();
        Runnable runnable = m80Var.f27293p;
        if (runnable != null) {
            runnable.run();
            m80Var.f27293p = null;
        }
    }
}
