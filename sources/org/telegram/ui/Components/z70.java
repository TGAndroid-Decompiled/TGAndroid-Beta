package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class z70 implements PopupWindow.OnDismissListener {
    public final int f42737a;
    public final FrameLayout f42738b;
    public final View f42739c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f42740e;

    public z70(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i7) {
        this.f42737a = i7;
        this.f42740e = viewGroup;
        this.f42739c = view;
        this.f42738b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f42737a) {
            case 0:
                ((d80) this.f42740e).f34241s = null;
                hi.w5 w5Var = (hi.w5) this.f42739c;
                w5Var.animate().cancel();
                w5Var.animate().alpha(0.0f).setDuration(150L).setListener(new p60(this, 3));
                return;
            default:
                ((org.telegram.ui.hy) this.f42740e).f46906y = null;
                hi.w5 w5Var2 = (hi.w5) this.f42739c;
                w5Var2.animate().cancel();
                w5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.zx(this, 0));
                return;
        }
    }
}
