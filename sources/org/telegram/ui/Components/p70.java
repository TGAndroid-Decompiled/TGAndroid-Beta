package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class p70 implements PopupWindow.OnDismissListener {
    public final int f38234a;
    public final FrameLayout f38235b;
    public final View f38236c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f38237e;

    public p70(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i7) {
        this.f38234a = i7;
        this.f38237e = viewGroup;
        this.f38236c = view;
        this.f38235b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f38234a) {
            case 0:
                ((t70) this.f38237e).f39583s = null;
                hi.n5 n5Var = (hi.n5) this.f38236c;
                n5Var.animate().cancel();
                n5Var.animate().alpha(0.0f).setDuration(150L).setListener(new h60(this, 3));
                return;
            default:
                ((org.telegram.ui.fy) this.f38237e).f54053y = null;
                hi.n5 n5Var2 = (hi.n5) this.f38236c;
                n5Var2.animate().cancel();
                n5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.xx(this, 0));
                return;
        }
    }
}
