package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class i70 implements PopupWindow.OnDismissListener {
    public final int f34628a;
    public final FrameLayout f34629b;
    public final View f34630c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup f34631e;

    public i70(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i3) {
        this.f34628a = i3;
        this.f34631e = viewGroup;
        this.f34630c = view;
        this.f34629b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        switch (this.f34628a) {
            case 0:
                ((m70) this.f34631e).f36062s = null;
                gi.n5 n5Var = (gi.n5) this.f34630c;
                n5Var.animate().cancel();
                n5Var.animate().alpha(0.0f).setDuration(150L).setListener(new a60(this, 3));
                return;
            default:
                ((org.telegram.ui.zx) this.f34631e).f50346y = null;
                gi.n5 n5Var2 = (gi.n5) this.f34630c;
                n5Var2.animate().cancel();
                n5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Cells.w9(this, 29));
                return;
        }
    }
}
