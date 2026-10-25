package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class n90 implements PopupWindow.OnDismissListener {
    public final int f30926a;
    public final FrameLayout f30927b;
    public final View f30928c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public n90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f30926a = i10;
        this.e = viewGroup;
        this.f30928c = view;
        this.f30927b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f30926a) {
            case 0:
                ((r90) this.e).f32174s = null;
                fi.f6 f6Var = (fi.f6) this.f30928c;
                f6Var.animate().cancel();
                f6Var.animate().alpha(0.0f).setDuration(150L).setListener(new i10(this, 5));
                return;
            default:
                ((org.telegram.ui.jz) this.e).f39216x = null;
                fi.f6 f6Var2 = (fi.f6) this.f30928c;
                f6Var2.animate().cancel();
                f6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new h31(this, 28));
                return;
        }
    }
}
