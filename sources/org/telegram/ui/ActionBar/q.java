package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q implements r0.n, m1, b2 {
    public final int f19714a;
    public final Object f19715b;

    public q(Object obj, int i10) {
        this.f19714a = i10;
        this.f19715b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = this.f19714a;
        int i11 = 0;
        Object obj = this.f19715b;
        switch (i10) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f18593p1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                actionBarLayout.f18626n1 = defaultWindowInsets;
                actionBarLayout.f18628o1 = defaultWindowInsets2;
                actionBarLayout.f18623m1 = l1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), l1Var);
                    i11++;
                }
                return r0.l1.f42184b;
            case 1:
            case 2:
            case 4:
            default:
                z3 z3Var = (z3) obj;
                z3Var.e = l1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                if (!z3Var.f19973f.equals(defaultWindowInsets3) || !z3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f10580b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    z3Var.f19973f = defaultWindowInsets3;
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
                return r0.l1.f42184b;
            case 3:
                r0.i1 i1Var = l1Var.f42185a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.b f7 = i1Var.f(527);
                    rect.set(f7.f10579a, f7.f10580b, f7.f10581c, f7.d);
                } else {
                    rect.set(i1Var.i().f10579a, i1Var.i().f10580b, i1Var.i().f10581c, i1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return l1Var;
            case 5:
                return ((g3) obj).onApplyWindowInsetsToRoot(view, l1Var);
            case 6:
                x3 x3Var = (x3) obj;
                x3Var.f19919s = l1Var.f42185a.f(2).d;
                x3Var.invalidate();
                return r0.l1.f42184b;
        }
    }

    @Override
    public void f(c2 c2Var, int i10) {
        c2 c2Var2 = (c2) this.f19715b;
        DialogInterface.OnCancelListener onCancelListener = c2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(c2Var2);
        }
        c2Var2.dismiss();
    }

    @Override
    public void p(KeyEvent keyEvent) {
        o1 o1Var;
        w0 w0Var = (w0) this.f19715b;
        w0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = w0Var.d) != null && o1Var.isShowing()) {
            w0Var.d.d(true);
        }
    }
}
