package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class u90 implements PopupWindow.OnDismissListener {
    public final int f31354a;
    public final FrameLayout f31355b;
    public final View f31356c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f31357e;

    public u90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f31354a = i10;
        this.f31357e = viewGroup;
        this.f31356c = view;
        this.f31355b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f31354a) {
            case 0:
                ((y90) this.f31357e).f33148s = null;
                ci.r6 r6Var = (ci.r6) this.f31356c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new t8(this, 28));
                return;
            default:
                ((org.telegram.ui.zz) this.f31357e).f42807x = null;
                ci.r6 r6Var2 = (ci.r6) this.f31356c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new k91(this, 21));
                return;
        }
    }
}
