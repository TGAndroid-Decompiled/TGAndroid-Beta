package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class m70 implements PopupWindow.OnDismissListener {
    public final int f35900a;
    public final FrameLayout f35901b;
    public final View f35902c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f35903e;

    public m70(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i7) {
        this.f35900a = i7;
        this.f35903e = viewGroup;
        this.f35902c = view;
        this.f35901b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f35900a) {
            case 0:
                ((q70) this.f35903e).f37185s = null;
                fi.p5 p5Var = (fi.p5) this.f35902c;
                p5Var.animate().cancel();
                p5Var.animate().alpha(0.0f).setDuration(150L).setListener(new e60(this, 3));
                return;
            default:
                ((org.telegram.ui.ey) this.f35903e).f52365y = null;
                fi.p5 p5Var2 = (fi.p5) this.f35902c;
                p5Var2.animate().cancel();
                p5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.va(this, 29));
                return;
        }
    }
}
