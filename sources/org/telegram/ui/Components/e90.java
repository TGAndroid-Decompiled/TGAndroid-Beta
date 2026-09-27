package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class e90 implements PopupWindow.OnDismissListener {
    public final int f23989a;
    public final FrameLayout f23990b;
    public final View f23991c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public e90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f23989a = i10;
        this.e = viewGroup;
        this.f23991c = view;
        this.f23990b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f23989a) {
            case 0:
                ((i90) this.e).f25061s = null;
                ci.r6 r6Var = (ci.r6) this.f23991c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new r8(this, 28));
                return;
            default:
                ((org.telegram.ui.zz) this.e).f38389x = null;
                ci.r6 r6Var2 = (ci.r6) this.f23991c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new s81(this, 21));
                return;
        }
    }
}
