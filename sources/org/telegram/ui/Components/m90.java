package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class m90 implements PopupWindow.OnDismissListener {
    public final int f28474a;
    public final FrameLayout f28475b;
    public final View f28476c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public m90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f28474a = i10;
        this.e = viewGroup;
        this.f28476c = view;
        this.f28475b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f28474a) {
            case 0:
                ((q90) this.e).f29603s = null;
                ei.g6 g6Var = (ei.g6) this.f28476c;
                g6Var.animate().cancel();
                g6Var.animate().alpha(0.0f).setDuration(150L).setListener(new c80(this, 3));
                return;
            default:
                ((org.telegram.ui.lz) this.e).f37375x = null;
                ei.g6 g6Var2 = (ei.g6) this.f28476c;
                g6Var2.animate().cancel();
                g6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new n31(this, 26));
                return;
        }
    }
}
