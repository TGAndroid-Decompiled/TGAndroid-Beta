package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class r80 implements PopupWindow.OnDismissListener {
    public final int f27577a;
    public final FrameLayout f27578b;
    public final View f27579c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public r80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f27577a = i10;
        this.e = viewGroup;
        this.f27579c = view;
        this.f27578b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f27577a) {
            case 0:
                ((v80) this.e).f28656s = null;
                ci.s6 s6Var = (ci.s6) this.f27579c;
                s6Var.animate().cancel();
                s6Var.animate().alpha(0.0f).setDuration(150L).setListener(new p8(this, 27));
                return;
            default:
                ((org.telegram.ui.c00) this.e).f39740x = null;
                ci.s6 s6Var2 = (ci.s6) this.f27579c;
                s6Var2.animate().cancel();
                s6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new w81(this, 20));
                return;
        }
    }
}
