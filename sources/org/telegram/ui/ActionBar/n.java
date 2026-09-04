package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class n implements r0.n, l1, a2 {
    public final int f21201a;
    public final Object f21202b;

    public n(Object obj, int i10) {
        this.f21201a = i10;
        this.f21202b = obj;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        int i10 = this.f21201a;
        int i11 = 0;
        Object obj = this.f21202b;
        switch (i10) {
            case 0:
                return ((n2) obj).onInsetsInternal(view, l1Var);
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f20134p1;
                i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.c defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                actionBarLayout.f20168n1 = defaultWindowInsets;
                actionBarLayout.f20170o1 = defaultWindowInsets2;
                actionBarLayout.f20165m1 = l1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), l1Var);
                    i11++;
                }
                return r0.l1.f44710b;
            case 2:
            case 3:
            case 5:
            default:
                z3 z3Var = (z3) obj;
                z3Var.f21559e = l1Var;
                i0.c defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.c defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                if (!z3Var.f21560f.equals(defaultWindowInsets3) || !z3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f11426b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    z3Var.f21560f = defaultWindowInsets3;
                    z3Var.h = defaultWindowInsets4;
                    z3Var.requestLayout();
                }
                int childCount2 = z3Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = z3Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, l1Var);
                    }
                    i11++;
                }
                z3Var.invalidate();
                return r0.l1.f44710b;
            case 4:
                r0.i1 i1Var = l1Var.f44711a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.c f7 = i1Var.f(527);
                    rect.set(f7.f11425a, f7.f11426b, f7.f11427c, f7.d);
                } else {
                    rect.set(i1Var.i().f11425a, i1Var.i().f11426b, i1Var.i().f11427c, i1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return l1Var;
            case 6:
                return ((f3) obj).onApplyWindowInsetsToRoot(view, l1Var);
            case 7:
                x3 x3Var = (x3) obj;
                x3Var.f21500s = l1Var.f44711a.f(2).d;
                x3Var.invalidate();
                return r0.l1.f44710b;
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        b2 b2Var2 = (b2) this.f21202b;
        DialogInterface.OnCancelListener onCancelListener = b2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(b2Var2);
        }
        b2Var2.dismiss();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        n1 n1Var;
        v0 v0Var = (v0) this.f21202b;
        v0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = v0Var.d) != null && n1Var.isShowing()) {
            v0Var.d.d(true);
        }
    }
}
