package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class u80 implements PopupWindow.OnDismissListener {
    public final int f31555a;
    public final FrameLayout f31556b;
    public final View f31557c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f31558e;

    public u80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f31555a = i10;
        this.f31558e = viewGroup;
        this.f31557c = view;
        this.f31556b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f31555a) {
            case 0:
                ((y80) this.f31558e).f33431s = null;
                fg.i0 i0Var = (fg.i0) this.f31557c;
                i0Var.animate().cancel();
                i0Var.animate().alpha(0.0f).setDuration(150L).setListener(new a9(this, 26));
                return;
            default:
                ((org.telegram.ui.xz) this.f31558e).f41341x = null;
                fg.i0 i0Var2 = (fg.i0) this.f31557c;
                i0Var2.animate().cancel();
                i0Var2.animate().alpha(0.0f).setDuration(150L).setListener(new f91(this, 19));
                return;
        }
    }
}
