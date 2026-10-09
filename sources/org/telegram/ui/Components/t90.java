package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class t90 implements PopupWindow.OnDismissListener {
    public final int f31094a;
    public final FrameLayout f31095b;
    public final View f31096c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f31097e;

    public t90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f31094a = i10;
        this.f31097e = viewGroup;
        this.f31096c = view;
        this.f31095b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f31094a) {
            case 0:
                ((x90) this.f31097e).f32787s = null;
                ci.r6 r6Var = (ci.r6) this.f31096c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new t8(this, 28));
                return;
            default:
                ((org.telegram.ui.a00) this.f31097e).f43019x = null;
                ci.r6 r6Var2 = (ci.r6) this.f31096c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new i91(this, 21));
                return;
        }
    }
}
