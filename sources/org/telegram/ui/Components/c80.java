package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class c80 implements PopupWindow.OnDismissListener {
    public final int f34112a;
    public final FrameLayout f34113b;
    public final View f34114c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f34115e;

    public c80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i7) {
        this.f34112a = i7;
        this.f34115e = viewGroup;
        this.f34114c = view;
        this.f34113b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f34112a) {
            case 0:
                ((g80) this.f34115e).f35474s = null;
                hi.l5 l5Var = (hi.l5) this.f34114c;
                l5Var.animate().cancel();
                l5Var.animate().alpha(0.0f).setDuration(150L).setListener(new s60(this, 3));
                return;
            default:
                ((org.telegram.ui.iy) this.f34115e).f47078y = null;
                hi.l5 l5Var2 = (hi.l5) this.f34114c;
                l5Var2.animate().cancel();
                l5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.ay(this, 0));
                return;
        }
    }
}
