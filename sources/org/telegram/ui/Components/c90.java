package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class c90 implements PopupWindow.OnDismissListener {
    public final int f23290a;
    public final FrameLayout f23291b;
    public final View f23292c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public c90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f23290a = i10;
        this.e = viewGroup;
        this.f23292c = view;
        this.f23291b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f23290a) {
            case 0:
                ((g90) this.e).f24411s = null;
                ci.r6 r6Var = (ci.r6) this.f23292c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new r8(this, 28));
                return;
            default:
                ((org.telegram.ui.wz) this.e).f37549x = null;
                ci.r6 r6Var2 = (ci.r6) this.f23292c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new q81(this, 21));
                return;
        }
    }
}
