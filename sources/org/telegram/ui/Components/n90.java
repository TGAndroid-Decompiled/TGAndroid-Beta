package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class n90 implements PopupWindow.OnDismissListener {
    public final int f28902a;
    public final FrameLayout f28903b;
    public final View f28904c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public n90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f28902a = i10;
        this.e = viewGroup;
        this.f28904c = view;
        this.f28903b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f28902a) {
            case 0:
                ((r90) this.e).f30129s = null;
                ei.g6 g6Var = (ei.g6) this.f28904c;
                g6Var.animate().cancel();
                g6Var.animate().alpha(0.0f).setDuration(150L).setListener(new i60(this, 4));
                return;
            default:
                ((org.telegram.ui.mz) this.e).f37995x = null;
                ei.g6 g6Var2 = (ei.g6) this.f28904c;
                g6Var2.animate().cancel();
                g6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new p31(this, 27));
                return;
        }
    }
}
