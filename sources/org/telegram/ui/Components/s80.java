package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class s80 implements PopupWindow.OnDismissListener {
    public final int f27872a;
    public final FrameLayout f27873b;
    public final View f27874c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public s80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f27872a = i10;
        this.e = viewGroup;
        this.f27874c = view;
        this.f27873b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f27872a) {
            case 0:
                ((w80) this.e).f29573s = null;
                ci.r6 r6Var = (ci.r6) this.f27874c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new r8(this, 27));
                return;
            default:
                ((org.telegram.ui.xz) this.e).f37472x = null;
                ci.r6 r6Var2 = (ci.r6) this.f27874c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new u81(this, 20));
                return;
        }
    }
}
