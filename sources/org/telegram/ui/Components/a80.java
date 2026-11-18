package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class a80 implements PopupWindow.OnDismissListener {
    public final int f33262a;
    public final FrameLayout f33263b;
    public final View f33264c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f33265e;

    public a80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i7) {
        this.f33262a = i7;
        this.f33265e = viewGroup;
        this.f33264c = view;
        this.f33263b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f33262a) {
            case 0:
                ((e80) this.f33265e).f34646s = null;
                hi.m5 m5Var = (hi.m5) this.f33264c;
                m5Var.animate().cancel();
                m5Var.animate().alpha(0.0f).setDuration(150L).setListener(new q60(this, 3));
                return;
            default:
                ((org.telegram.ui.iy) this.f33265e).f47086y = null;
                hi.m5 m5Var2 = (hi.m5) this.f33264c;
                m5Var2.animate().cancel();
                m5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.ay(this, 0));
                return;
        }
    }
}
