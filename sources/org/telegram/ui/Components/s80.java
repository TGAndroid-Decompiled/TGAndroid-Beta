package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class s80 implements PopupWindow.OnDismissListener {
    public final int f30220a;
    public final FrameLayout f30221b;
    public final View f30222c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f30223e;

    public s80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f30220a = i10;
        this.f30223e = viewGroup;
        this.f30222c = view;
        this.f30221b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f30220a) {
            case 0:
                ((w80) this.f30223e).f32206s = null;
                di.r6 r6Var = (di.r6) this.f30222c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new r80(this, 0));
                return;
            default:
                ((org.telegram.ui.a00) this.f30223e).f41724x = null;
                di.r6 r6Var2 = (di.r6) this.f30222c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new k61(this, 23));
                return;
        }
    }
}
