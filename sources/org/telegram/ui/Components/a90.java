package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class a90 implements PopupWindow.OnDismissListener {
    public final int f22568a;
    public final FrameLayout f22569b;
    public final View f22570c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public a90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f22568a = i10;
        this.e = viewGroup;
        this.f22570c = view;
        this.f22569b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f22568a) {
            case 0:
                ((e90) this.e).f23829s = null;
                ci.s6 s6Var = (ci.s6) this.f22570c;
                s6Var.animate().cancel();
                s6Var.animate().alpha(0.0f).setDuration(150L).setListener(new r8(this, 28));
                return;
            default:
                ((org.telegram.ui.a00) this.e).f38644x = null;
                ci.s6 s6Var2 = (ci.s6) this.f22570c;
                s6Var2.animate().cancel();
                s6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new r81(this, 21));
                return;
        }
    }
}
