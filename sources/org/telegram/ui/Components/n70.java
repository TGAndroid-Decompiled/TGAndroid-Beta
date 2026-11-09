package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class n70 implements PopupWindow.OnDismissListener {
    public final int f36278a;
    public final FrameLayout f36279b;
    public final View f36280c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f36281e;

    public n70(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i7) {
        this.f36278a = i7;
        this.f36281e = viewGroup;
        this.f36280c = view;
        this.f36279b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f36278a) {
            case 0:
                ((r70) this.f36281e).f37571s = null;
                fi.p5 p5Var = (fi.p5) this.f36280c;
                p5Var.animate().cancel();
                p5Var.animate().alpha(0.0f).setDuration(150L).setListener(new f60(this, 3));
                return;
            default:
                ((org.telegram.ui.gy) this.f36281e).f43826y = null;
                fi.p5 p5Var2 = (fi.p5) this.f36280c;
                p5Var2.animate().cancel();
                p5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.va(this, 29));
                return;
        }
    }
}
