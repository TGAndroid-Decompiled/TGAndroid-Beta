package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
public final class j60 implements PopupWindow.OnDismissListener {
    public final ViewGroup f35881a;
    public final m60 f35882b;

    public j60(m60 m60Var, ViewGroup viewGroup) {
        this.f35882b = m60Var;
        this.f35881a = viewGroup;
    }

    @Override
    public final void onDismiss() {
        View view;
        m60 m60Var = this.f35882b;
        m60Var.f37101m = null;
        m60.a(m60Var, this.f35881a);
        View view2 = m60Var.f37107p0;
        if (view2 != null) {
            view2.setPressed(false);
            m60Var.f37107p0 = null;
        }
        if (m60Var.f37105o0 != null && (view = m60Var.f37088f) != null) {
            view.setOnTouchListener(null);
        }
        m60Var.f37105o0 = null;
        m60Var.N();
        Runnable runnable = m60Var.f37106p;
        if (runnable != null) {
            runnable.run();
            m60Var.f37106p = null;
        }
    }
}
