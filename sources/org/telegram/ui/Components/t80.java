package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class t80 implements PopupWindow.OnDismissListener {
    public final int f28943a;
    public final FrameLayout f28944b;
    public final View f28945c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public t80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f28943a = i10;
        this.e = viewGroup;
        this.f28945c = view;
        this.f28944b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f28943a) {
            case 0:
                ((x80) this.e).f30539s = null;
                eg.i0 i0Var = (eg.i0) this.f28945c;
                i0Var.animate().cancel();
                i0Var.animate().alpha(0.0f).setDuration(150L).setListener(new a9(this, 26));
                return;
            default:
                ((org.telegram.ui.yz) this.e).f38622x = null;
                eg.i0 i0Var2 = (eg.i0) this.f28945c;
                i0Var2.animate().cancel();
                i0Var2.animate().alpha(0.0f).setDuration(150L).setListener(new f91(this, 19));
                return;
        }
    }
}
