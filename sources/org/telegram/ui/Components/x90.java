package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class x90 implements PopupWindow.OnDismissListener {
    public final int f32687a;
    public final FrameLayout f32688b;
    public final View f32689c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f32690e;

    public x90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f32687a = i10;
        this.f32690e = viewGroup;
        this.f32689c = view;
        this.f32688b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f32687a) {
            case 0:
                ((ba0) this.f32690e).f24599s = null;
                ci.r6 r6Var = (ci.r6) this.f32689c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new t8(this, 28));
                return;
            default:
                ((org.telegram.ui.c00) this.f32690e).f44212x = null;
                ci.r6 r6Var2 = (ci.r6) this.f32689c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new o91(this, 21));
                return;
        }
    }
}
