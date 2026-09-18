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
    public final int f19663a;
    public final Object f19664b;

    public p(Object obj, int i10) {
        this.f19663a = i10;
        this.f19664b = obj;
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        int i10 = this.f19663a;
        int i11 = 0;
        Object obj = this.f19664b;
        switch (i10) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f18560p1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, true);
                actionBarLayout.f18593n1 = defaultWindowInsets;
                actionBarLayout.f18595o1 = defaultWindowInsets2;
                actionBarLayout.f18590m1 = m1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), m1Var);
                    i11++;
                }
                return r0.m1.f42108b;
            case 1:
            case 2:
            case 4:
            default:
                z3 z3Var = (z3) obj;
                z3Var.e = m1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(m1Var, true);
                if (!z3Var.f19935f.equals(defaultWindowInsets3) || !z3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f10592b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    z3Var.f19935f = defaultWindowInsets3;
                    z3Var.h = defaultWindowInsets4;
                    z3Var.requestLayout();
                }
                int childCount2 = z3Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = z3Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, m1Var);
                    }
                    i11++;
                }
                z3Var.invalidate();
                return r0.m1.f42108b;
            case 3:
                r0.j1 j1Var = m1Var.f42109a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.b f7 = j1Var.f(527);
                    rect.set(f7.f10591a, f7.f10592b, f7.f10593c, f7.d);
                } else {
                    rect.set(j1Var.i().f10591a, j1Var.i().f10592b, j1Var.i().f10593c, j1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return m1Var;
            case 5:
                return ((f3) obj).onApplyWindowInsetsToRoot(view, m1Var);
            case 6:
                x3 x3Var = (x3) obj;
                x3Var.f19880s = m1Var.f42109a.f(2).d;
                x3Var.invalidate();
                return r0.m1.f42108b;
        }
    }

    @Override
    public void f(b2 b2Var, int i10) {
        b2 b2Var2 = (b2) this.f19664b;
        DialogInterface.OnCancelListener onCancelListener = b2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(b2Var2);
        }
        b2Var2.dismiss();
    }

    @Override
    public void p(KeyEvent keyEvent) {
        n1 n1Var;
        v0 v0Var = (v0) this.f19664b;
        v0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = v0Var.d) != null && n1Var.isShowing()) {
            v0Var.d.d(true);
        }
    }
}
