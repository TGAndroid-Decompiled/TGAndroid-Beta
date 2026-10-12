package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class s90 implements PopupWindow.OnDismissListener {
    public final int f29067a;
    public final FrameLayout f29068b;
    public final View f29069c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public s90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f29067a = i10;
        this.e = viewGroup;
        this.f29069c = view;
        this.f29068b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f29067a) {
            case 0:
                ((w90) this.e).f30832s = null;
                di.p6 p6Var = (di.p6) this.f29069c;
                p6Var.animate().cancel();
                p6Var.animate().alpha(0.0f).setDuration(150L).setListener(new k90(this, 1));
                return;
            default:
                ((org.telegram.ui.f00) this.e).f34008x = null;
                di.p6 p6Var2 = (di.p6) this.f29069c;
                p6Var2.animate().cancel();
                p6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new u61(this, 24));
                return;
        }
    }
}
