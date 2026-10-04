package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class f90 implements PopupWindow.OnDismissListener {
    public final int f26388a;
    public final FrameLayout f26389b;
    public final View f26390c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f26391e;

    public f90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f26388a = i10;
        this.f26391e = viewGroup;
        this.f26390c = view;
        this.f26389b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f26388a) {
            case 0:
                ((j90) this.f26391e).f27691s = null;
                ci.r6 r6Var = (ci.r6) this.f26390c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new r8(this, 28));
                return;
            default:
                ((org.telegram.ui.a00) this.f26391e).f41866x = null;
                ci.r6 r6Var2 = (ci.r6) this.f26390c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new a91(this, 21));
                return;
        }
    }
}
