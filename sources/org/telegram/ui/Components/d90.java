package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class d90 implements PopupWindow.OnDismissListener {
    public final int f23636a;
    public final FrameLayout f23637b;
    public final View f23638c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public d90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f23636a = i10;
        this.e = viewGroup;
        this.f23638c = view;
        this.f23637b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f23636a) {
            case 0:
                ((h90) this.e).f24732s = null;
                ci.r6 r6Var = (ci.r6) this.f23638c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new r8(this, 28));
                return;
            default:
                ((org.telegram.ui.wz) this.e).f37548x = null;
                ci.r6 r6Var2 = (ci.r6) this.f23638c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new r81(this, 21));
                return;
        }
    }
}
