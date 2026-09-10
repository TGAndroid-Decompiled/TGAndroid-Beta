package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class b90 implements PopupWindow.OnDismissListener {
    public final int f21765a;
    public final FrameLayout f21766b;
    public final View f21767c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public b90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f21765a = i10;
        this.e = viewGroup;
        this.f21767c = view;
        this.f21766b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f21765a) {
            case 0:
                ((f90) this.e).f22953s = null;
                bi.s7 s7Var = (bi.s7) this.f21767c;
                s7Var.animate().cancel();
                s7Var.animate().alpha(0.0f).setDuration(150L).setListener(new rm(this, 17));
                return;
            default:
                ((org.telegram.ui.c00) this.e).f38850x = null;
                bi.s7 s7Var2 = (bi.s7) this.f21767c;
                s7Var2.animate().cancel();
                s7Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.voip.v2(this, 10));
                return;
        }
    }
}
