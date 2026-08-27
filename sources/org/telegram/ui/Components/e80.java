package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

public final class e80 implements PopupWindow.OnDismissListener {

    public final int f27969a;

    public final FrameLayout f27970b;

    public final View f27971c;
    public final ViewTreeObserver.OnPreDrawListener d;

    public final ViewGroup f27972e;

    public e80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f27969a = i10;
        this.f27972e = viewGroup;
        this.f27971c = view;
        this.f27970b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f27969a) {
            case 0:
                ((i80) this.f27972e).f29276s = null;
                ag.t0 t0Var = (ag.t0) this.f27971c;
                t0Var.animate().cancel();
                t0Var.animate().alpha(0.0f).setDuration(150L).setListener(new sz(this, 5));
                break;
            default:
                ((org.telegram.ui.mz) this.f27972e).f38921x = null;
                ag.t0 t0Var2 = (ag.t0) this.f27971c;
                t0Var2.animate().cancel();
                t0Var2.animate().alpha(0.0f).setDuration(150L).setListener(new f11(this, 28));
                break;
        }
    }
}
