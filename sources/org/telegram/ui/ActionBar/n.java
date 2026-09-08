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
    public final int f21228a;
    public final Object f21229b;

    public n(Object obj, int i10) {
        this.f21228a = i10;
        this.f21229b = obj;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        int i10 = this.f21228a;
        int i11 = 0;
        Object obj = this.f21229b;
        switch (i10) {
            case 0:
                return ((n2) obj).onInsetsInternal(view, l1Var);
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f20161p1;
                i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.c defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                actionBarLayout.f20195n1 = defaultWindowInsets;
                actionBarLayout.f20197o1 = defaultWindowInsets2;
                actionBarLayout.f20192m1 = l1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), l1Var);
                    i11++;
                }
                return r0.l1.f44738b;
            case 2:
            case 3:
            case 5:
            default:
                z3 z3Var = (z3) obj;
                z3Var.f21586e = l1Var;
                i0.c defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.c defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                if (!z3Var.f21587f.equals(defaultWindowInsets3) || !z3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f11452b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    z3Var.f21587f = defaultWindowInsets3;
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
                return r0.l1.f44738b;
            case 4:
                r0.i1 i1Var = l1Var.f44739a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.c f7 = i1Var.f(527);
                    rect.set(f7.f11451a, f7.f11452b, f7.f11453c, f7.d);
                } else {
                    rect.set(i1Var.i().f11451a, i1Var.i().f11452b, i1Var.i().f11453c, i1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return l1Var;
            case 6:
                return ((f3) obj).onApplyWindowInsetsToRoot(view, l1Var);
            case 7:
                x3 x3Var = (x3) obj;
                x3Var.f21527s = l1Var.f44739a.f(2).d;
                x3Var.invalidate();
                return r0.l1.f44738b;
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        b2 b2Var2 = (b2) this.f21229b;
        DialogInterface.OnCancelListener onCancelListener = b2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(b2Var2);
        }
        b2Var2.dismiss();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        n1 n1Var;
        v0 v0Var = (v0) this.f21229b;
        v0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = v0Var.d) != null && n1Var.isShowing()) {
            v0Var.d.d(true);
        }
    }
}
