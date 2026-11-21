package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class c80 implements PopupWindow.OnDismissListener {
    public final int f34118a;
    public final FrameLayout f34119b;
    public final View f34120c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f34121e;

    public c80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i7) {
        this.f34118a = i7;
        this.f34121e = viewGroup;
        this.f34120c = view;
        this.f34119b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f34118a) {
            case 0:
                ((g80) this.f34121e).f35455s = null;
                hi.l5 l5Var = (hi.l5) this.f34120c;
                l5Var.animate().cancel();
                l5Var.animate().alpha(0.0f).setDuration(150L).setListener(new s60(this, 3));
                return;
            default:
                ((org.telegram.ui.iy) this.f34121e).f47075y = null;
                hi.l5 l5Var2 = (hi.l5) this.f34120c;
                l5Var2.animate().cancel();
                l5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.ay(this, 0));
                return;
        }
    }
}
