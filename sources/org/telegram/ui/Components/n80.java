package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class n80 implements PopupWindow.OnDismissListener {
    public final int f30926a;
    public final FrameLayout f30927b;
    public final View f30928c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f30929e;

    public n80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.f30926a = i10;
        this.f30929e = viewGroup;
        this.f30928c = view;
        this.f30927b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f30926a) {
            case 0:
                ((r80) this.f30929e).f32238s = null;
                cg.i0 i0Var = (cg.i0) this.f30928c;
                i0Var.animate().cancel();
                i0Var.animate().alpha(0.0f).setDuration(150L).setListener(new zz(this, 5));
                return;
            default:
                ((org.telegram.ui.lz) this.f30929e).f38702x = null;
                cg.i0 i0Var2 = (cg.i0) this.f30928c;
                i0Var2.animate().cancel();
                i0Var2.animate().alpha(0.0f).setDuration(150L).setListener(new p11(this, 28));
                return;
        }
    }
}
