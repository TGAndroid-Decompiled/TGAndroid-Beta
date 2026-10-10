package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class u90 implements PopupWindow.OnDismissListener {
    public final int f31426a;
    public final FrameLayout f31427b;
    public final View f31428c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f31429e;

    public u90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f31426a = i10;
        this.f31429e = viewGroup;
        this.f31428c = view;
        this.f31427b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f31426a) {
            case 0:
                ((y90) this.f31429e).f33153s = null;
                ci.r6 r6Var = (ci.r6) this.f31428c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new t8(this, 28));
                return;
            default:
                ((org.telegram.ui.a00) this.f31429e).f43065x = null;
                ci.r6 r6Var2 = (ci.r6) this.f31428c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new j91(this, 21));
                return;
        }
    }
}
