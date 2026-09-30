package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class f90 implements PopupWindow.OnDismissListener {
    public final int f24250a;
    public final FrameLayout f24251b;
    public final View f24252c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public f90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f24250a = i10;
        this.e = viewGroup;
        this.f24252c = view;
        this.f24251b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f24250a) {
            case 0:
                ((j90) this.e).f25376s = null;
                ci.r6 r6Var = (ci.r6) this.f24252c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new r8(this, 28));
                return;
            default:
                ((org.telegram.ui.wz) this.e).f37645x = null;
                ci.r6 r6Var2 = (ci.r6) this.f24252c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new s81(this, 21));
                return;
        }
    }
}
