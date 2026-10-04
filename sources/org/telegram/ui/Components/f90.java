package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class f90 implements PopupWindow.OnDismissListener {
    public final int f26387a;
    public final FrameLayout f26388b;
    public final View f26389c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f26390e;

    public f90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f26387a = i10;
        this.f26390e = viewGroup;
        this.f26389c = view;
        this.f26388b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f26387a) {
            case 0:
                ((j90) this.f26390e).f27690s = null;
                ci.r6 r6Var = (ci.r6) this.f26389c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new r8(this, 28));
                return;
            default:
                ((org.telegram.ui.a00) this.f26390e).f41865x = null;
                ci.r6 r6Var2 = (ci.r6) this.f26389c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new a91(this, 21));
                return;
        }
    }
}
