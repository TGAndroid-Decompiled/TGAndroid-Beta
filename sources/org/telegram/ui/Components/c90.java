package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class c90 implements PopupWindow.OnDismissListener {
    public final int f23314a;
    public final FrameLayout f23315b;
    public final View f23316c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public c90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f23314a = i10;
        this.e = viewGroup;
        this.f23316c = view;
        this.f23315b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f23314a) {
            case 0:
                ((g90) this.e).f24475s = null;
                ci.s6 s6Var = (ci.s6) this.f23316c;
                s6Var.animate().cancel();
                s6Var.animate().alpha(0.0f).setDuration(150L).setListener(new q8(this, 28));
                return;
            default:
                ((org.telegram.ui.a00) this.e).f38645x = null;
                ci.s6 s6Var2 = (ci.s6) this.f23316c;
                s6Var2.animate().cancel();
                s6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new t81(this, 21));
                return;
        }
    }
}
