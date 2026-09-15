package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class r80 implements PopupWindow.OnDismissListener {
    public final int f27604a;
    public final FrameLayout f27605b;
    public final View f27606c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public r80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f27604a = i10;
        this.e = viewGroup;
        this.f27606c = view;
        this.f27605b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f27604a) {
            case 0:
                ((v80) this.e).f28660s = null;
                ci.s6 s6Var = (ci.s6) this.f27606c;
                s6Var.animate().cancel();
                s6Var.animate().alpha(0.0f).setDuration(150L).setListener(new p8(this, 27));
                return;
            default:
                ((org.telegram.ui.a00) this.e).f38720x = null;
                ci.s6 s6Var2 = (ci.s6) this.f27606c;
                s6Var2.animate().cancel();
                s6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new v81(this, 20));
                return;
        }
    }
}
