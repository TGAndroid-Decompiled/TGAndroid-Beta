package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class l90 implements PopupWindow.OnDismissListener {
    public final int f28277a;
    public final FrameLayout f28278b;
    public final View f28279c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public l90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f28277a = i10;
        this.e = viewGroup;
        this.f28279c = view;
        this.f28278b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f28277a) {
            case 0:
                ((p90) this.e).f29522s = null;
                ei.g6 g6Var = (ei.g6) this.f28279c;
                g6Var.animate().cancel();
                g6Var.animate().alpha(0.0f).setDuration(150L).setListener(new g60(this, 4));
                return;
            default:
                ((org.telegram.ui.mz) this.e).f38080x = null;
                ei.g6 g6Var2 = (ei.g6) this.f28279c;
                g6Var2.animate().cancel();
                g6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new o31(this, 27));
                return;
        }
    }
}
