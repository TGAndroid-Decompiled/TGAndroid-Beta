package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class t90 implements PopupWindow.OnDismissListener {
    public final int f31180a;
    public final FrameLayout f31181b;
    public final View f31182c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f31183e;

    public t90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f31180a = i10;
        this.f31183e = viewGroup;
        this.f31182c = view;
        this.f31181b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f31180a) {
            case 0:
                ((x90) this.f31183e).f32919s = null;
                ci.r6 r6Var = (ci.r6) this.f31182c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new t8(this, 28));
                return;
            default:
                ((org.telegram.ui.zz) this.f31183e).f42841x = null;
                ci.r6 r6Var2 = (ci.r6) this.f31182c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new j91(this, 21));
                return;
        }
    }
}
