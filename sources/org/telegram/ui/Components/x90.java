package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class x90 implements PopupWindow.OnDismissListener {
    public final int f32686a;
    public final FrameLayout f32687b;
    public final View f32688c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f32689e;

    public x90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f32686a = i10;
        this.f32689e = viewGroup;
        this.f32688c = view;
        this.f32687b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f32686a) {
            case 0:
                ((ba0) this.f32689e).f24587s = null;
                ci.r6 r6Var = (ci.r6) this.f32688c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new t8(this, 28));
                return;
            default:
                ((org.telegram.ui.c00) this.f32689e).f44217x = null;
                ci.r6 r6Var2 = (ci.r6) this.f32688c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new o91(this, 21));
                return;
        }
    }
}
