package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class m70 implements PopupWindow.OnDismissListener {
    public final int f35878a;
    public final FrameLayout f35879b;
    public final View f35880c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f35881e;

    public m70(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i7) {
        this.f35878a = i7;
        this.f35881e = viewGroup;
        this.f35880c = view;
        this.f35879b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f35878a) {
            case 0:
                ((q70) this.f35881e).f37162s = null;
                fi.p5 p5Var = (fi.p5) this.f35880c;
                p5Var.animate().cancel();
                p5Var.animate().alpha(0.0f).setDuration(150L).setListener(new e60(this, 3));
                return;
            default:
                ((org.telegram.ui.hy) this.f35881e).f44842y = null;
                fi.p5 p5Var2 = (fi.p5) this.f35880c;
                p5Var2.animate().cancel();
                p5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.va(this, 29));
                return;
        }
    }
}
