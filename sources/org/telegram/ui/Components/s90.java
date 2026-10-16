package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class s90 implements PopupWindow.OnDismissListener {
    public final int f28771a;
    public final FrameLayout f28772b;
    public final View f28773c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public s90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f28771a = i10;
        this.e = viewGroup;
        this.f28773c = view;
        this.f28772b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f28771a) {
            case 0:
                ((w90) this.e).f30508s = null;
                di.p6 p6Var = (di.p6) this.f28773c;
                p6Var.animate().cancel();
                p6Var.animate().alpha(0.0f).setDuration(150L).setListener(new k90(this, 1));
                return;
            default:
                ((org.telegram.ui.f00) this.e).f33711x = null;
                di.p6 p6Var2 = (di.p6) this.f28773c;
                p6Var2.animate().cancel();
                p6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new v61(this, 24));
                return;
        }
    }
}
