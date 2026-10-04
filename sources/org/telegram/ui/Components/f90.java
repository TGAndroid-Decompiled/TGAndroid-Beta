package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class f90 implements PopupWindow.OnDismissListener {
    public final int f26393a;
    public final FrameLayout f26394b;
    public final View f26395c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f26396e;

    public f90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f26393a = i10;
        this.f26396e = viewGroup;
        this.f26395c = view;
        this.f26394b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f26393a) {
            case 0:
                ((j90) this.f26396e).f27696s = null;
                ci.r6 r6Var = (ci.r6) this.f26395c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new r8(this, 28));
                return;
            default:
                ((org.telegram.ui.a00) this.f26396e).f41873x = null;
                ci.r6 r6Var2 = (ci.r6) this.f26395c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new a91(this, 21));
                return;
        }
    }
}
