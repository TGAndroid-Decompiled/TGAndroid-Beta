package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class z80 implements PopupWindow.OnDismissListener {
    public final int f30779a;
    public final FrameLayout f30780b;
    public final View f30781c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public z80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f30779a = i10;
        this.e = viewGroup;
        this.f30781c = view;
        this.f30780b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f30779a) {
            case 0:
                ((d90) this.e).f23538s = null;
                ci.s6 s6Var = (ci.s6) this.f30781c;
                s6Var.animate().cancel();
                s6Var.animate().alpha(0.0f).setDuration(150L).setListener(new q8(this, 28));
                return;
            default:
                ((org.telegram.ui.a00) this.e).f38624x = null;
                ci.s6 s6Var2 = (ci.s6) this.f30781c;
                s6Var2.animate().cancel();
                s6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new r81(this, 21));
                return;
        }
    }
}
