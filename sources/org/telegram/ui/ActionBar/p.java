package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p implements r0.n, l1, a2 {
    public final int f19710a;
    public final Object f19711b;

    public p(Object obj, int i10) {
        this.f19710a = i10;
        this.f19711b = obj;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int i10 = this.f19710a;
        int i11 = 0;
        Object obj = this.f19711b;
        switch (i10) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f18607p1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                actionBarLayout.f18640n1 = defaultWindowInsets;
                actionBarLayout.f18642o1 = defaultWindowInsets2;
                actionBarLayout.f18637m1 = l1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), l1Var);
                    i11++;
                }
                return r0.l1.f42174b;
            case 1:
            case 2:
            case 4:
            default:
                z3 z3Var = (z3) obj;
                z3Var.e = l1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                if (!z3Var.f19982f.equals(defaultWindowInsets3) || !z3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f10593b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    z3Var.f19982f = defaultWindowInsets3;
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
                return r0.l1.f42174b;
            case 3:
                r0.i1 i1Var = l1Var.f42175a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.b f7 = i1Var.f(527);
                    rect.set(f7.f10592a, f7.f10593b, f7.f10594c, f7.d);
                } else {
                    rect.set(i1Var.i().f10592a, i1Var.i().f10593b, i1Var.i().f10594c, i1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return l1Var;
            case 5:
                return ((f3) obj).onApplyWindowInsetsToRoot(view, l1Var);
            case 6:
                x3 x3Var = (x3) obj;
                x3Var.f19927s = l1Var.f42175a.f(2).d;
                x3Var.invalidate();
                return r0.l1.f42174b;
        }
    }

    @Override
    public void k(b2 b2Var, int i10) {
        b2 b2Var2 = (b2) this.f19711b;
        DialogInterface.OnCancelListener onCancelListener = b2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(b2Var2);
        }
        b2Var2.dismiss();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        n1 n1Var;
        v0 v0Var = (v0) this.f19711b;
        v0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = v0Var.d) != null && n1Var.isShowing()) {
            v0Var.d.d(true);
        }
    }
}
