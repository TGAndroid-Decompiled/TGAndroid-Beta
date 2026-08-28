package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class a80 implements PopupWindow.OnDismissListener {
    public final int f26720a;
    public final FrameLayout f26721b;
    public final View f26722c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f26723e;

    public a80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i9) {
        this.f26720a = i9;
        this.f26723e = viewGroup;
        this.f26722c = view;
        this.f26721b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f26720a) {
            case 0:
                ((e80) this.f26723e).f27974s = null;
                kh.h6 h6Var = (kh.h6) this.f26722c;
                h6Var.animate().cancel();
                h6Var.animate().alpha(0.0f).setDuration(150L).setListener(new r60(this, 3));
                return;
            default:
                ((org.telegram.ui.jz) this.f26723e).f38054x = null;
                kh.h6 h6Var2 = (kh.h6) this.f26722c;
                h6Var2.animate().cancel();
                h6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new y11(this, 26));
                return;
        }
    }
}
