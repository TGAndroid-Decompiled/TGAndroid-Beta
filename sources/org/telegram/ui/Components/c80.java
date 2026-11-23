package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class c80 implements PopupWindow.OnDismissListener {
    public final int f34076a;
    public final FrameLayout f34077b;
    public final View f34078c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f34079e;

    public c80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i7) {
        this.f34076a = i7;
        this.f34079e = viewGroup;
        this.f34078c = view;
        this.f34077b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f34076a) {
            case 0:
                ((g80) this.f34079e).f35436s = null;
                hi.m5 m5Var = (hi.m5) this.f34078c;
                m5Var.animate().cancel();
                m5Var.animate().alpha(0.0f).setDuration(150L).setListener(new s60(this, 3));
                return;
            default:
                ((org.telegram.ui.iy) this.f34079e).f47050y = null;
                hi.m5 m5Var2 = (hi.m5) this.f34078c;
                m5Var2.animate().cancel();
                m5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.ay(this, 0));
                return;
        }
    }
}
