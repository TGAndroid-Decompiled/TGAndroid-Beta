package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class s80 implements PopupWindow.OnDismissListener {
    public final int f30247a;
    public final FrameLayout f30248b;
    public final View f30249c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f30250e;

    public s80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f30247a = i10;
        this.f30250e = viewGroup;
        this.f30249c = view;
        this.f30248b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f30247a) {
            case 0:
                ((w80) this.f30250e).f32233s = null;
                di.r6 r6Var = (di.r6) this.f30249c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new r80(this, 0));
                return;
            default:
                ((org.telegram.ui.a00) this.f30250e).f41751x = null;
                di.r6 r6Var2 = (di.r6) this.f30249c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new k61(this, 23));
                return;
        }
    }
}
