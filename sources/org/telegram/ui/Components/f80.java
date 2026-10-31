package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class f80 implements PopupWindow.OnDismissListener {
    public final int f26009a;
    public final FrameLayout f26010b;
    public final View f26011c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public f80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f26009a = i10;
        this.e = viewGroup;
        this.f26011c = view;
        this.f26010b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f26009a) {
            case 0:
                ((j80) this.e).f27262s = null;
                kg.f0 f0Var = (kg.f0) this.f26011c;
                f0Var.animate().cancel();
                f0Var.animate().alpha(0.0f).setDuration(150L).setListener(new t60(this, 3));
                return;
            default:
                ((org.telegram.ui.gz) this.e).f36333y = null;
                kg.f0 f0Var2 = (kg.f0) this.f26011c;
                f0Var2.animate().cancel();
                f0Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.voip.h2(this, 10));
                return;
        }
    }
}
