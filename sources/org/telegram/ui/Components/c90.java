package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class c90 implements PopupWindow.OnDismissListener {
    public final int f23291a;
    public final FrameLayout f23292b;
    public final View f23293c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public c90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f23291a = i10;
        this.e = viewGroup;
        this.f23293c = view;
        this.f23292b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f23291a) {
            case 0:
                ((g90) this.e).f24412s = null;
                ci.r6 r6Var = (ci.r6) this.f23293c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new r8(this, 28));
                return;
            default:
                ((org.telegram.ui.wz) this.e).f37550x = null;
                ci.r6 r6Var2 = (ci.r6) this.f23293c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new q81(this, 21));
                return;
        }
    }
}
