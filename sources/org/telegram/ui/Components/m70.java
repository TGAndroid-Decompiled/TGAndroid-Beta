package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class m70 implements PopupWindow.OnDismissListener {
    public final int f35953a;
    public final FrameLayout f35954b;
    public final View f35955c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f35956e;

    public m70(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i7) {
        this.f35953a = i7;
        this.f35956e = viewGroup;
        this.f35955c = view;
        this.f35954b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f35953a) {
            case 0:
                ((q70) this.f35956e).f37300s = null;
                fi.p5 p5Var = (fi.p5) this.f35955c;
                p5Var.animate().cancel();
                p5Var.animate().alpha(0.0f).setDuration(150L).setListener(new e60(this, 3));
                return;
            default:
                ((org.telegram.ui.ey) this.f35956e).f52360y = null;
                fi.p5 p5Var2 = (fi.p5) this.f35955c;
                p5Var2.animate().cancel();
                p5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.va(this, 29));
                return;
        }
    }
}
