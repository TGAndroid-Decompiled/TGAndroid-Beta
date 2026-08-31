package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class n implements r0.o, n1, c2 {
    public final int f22152a;
    public final Object f22153b;

    public n(Object obj, int i10) {
        this.f22152a = i10;
        this.f22153b = obj;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int i10 = this.f22152a;
        int i11 = 0;
        Object obj = this.f22153b;
        switch (i10) {
            case 0:
                return ((p2) obj).onInsetsInternal(view, m1Var);
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f21105m1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, true);
                actionBarLayout.f21134k1 = defaultWindowInsets;
                actionBarLayout.l1 = defaultWindowInsets2;
                actionBarLayout.f21132j1 = m1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), m1Var);
                    i11++;
                }
                return r0.m1.f46451b;
            case 2:
            case 3:
            case 5:
            default:
                z3 z3Var = (z3) obj;
                z3Var.f22485e = m1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(m1Var, true);
                if (!z3Var.f22486f.equals(defaultWindowInsets3) || !z3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f7758b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    z3Var.f22486f = defaultWindowInsets3;
                    z3Var.h = defaultWindowInsets4;
                    z3Var.requestLayout();
                }
                int childCount2 = z3Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = z3Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.j0.b(childAt, m1Var);
                    }
                    i11++;
                }
                z3Var.invalidate();
                return r0.m1.f46451b;
            case 4:
                r0.j1 j1Var = m1Var.f46452a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.b f10 = j1Var.f(527);
                    rect.set(f10.f7757a, f10.f7758b, f10.f7759c, f10.d);
                } else {
                    rect.set(j1Var.i().f7757a, j1Var.i().f7758b, j1Var.i().f7759c, j1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return m1Var;
            case 6:
                x3 x3Var = (x3) obj;
                x3Var.f22419s = m1Var.f46452a.f(2).d;
                x3Var.invalidate();
                return r0.m1.f46451b;
        }
    }

    @Override
    public void j(d2 d2Var, int i10) {
        d2 d2Var2 = (d2) this.f22153b;
        DialogInterface.OnCancelListener onCancelListener = d2Var2.G;
        if (onCancelListener != null) {
            onCancelListener.onCancel(d2Var2);
        }
        d2Var2.dismiss();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        p1 p1Var;
        w0 w0Var = (w0) this.f22153b;
        w0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = w0Var.d) != null && p1Var.isShowing()) {
            w0Var.d.d(true);
        }
    }
}
