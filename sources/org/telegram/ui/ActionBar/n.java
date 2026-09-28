package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class n implements r0.n, k1, z1 {
    public final int f19655a;
    public final Object f19656b;

    public n(Object obj, int i10) {
        this.f19655a = i10;
        this.f19656b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = this.f19655a;
        int i11 = 0;
        Object obj = this.f19656b;
        switch (i10) {
            case 0:
                return ((m2) obj).onInsetsInternal(view, l1Var);
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f18599p1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                actionBarLayout.f18632n1 = defaultWindowInsets;
                actionBarLayout.f18634o1 = defaultWindowInsets2;
                actionBarLayout.f18629m1 = l1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), l1Var);
                    i11++;
                }
                return r0.l1.f42139b;
            case 2:
            case 3:
            case 5:
            default:
                x3 x3Var = (x3) obj;
                x3Var.e = l1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                if (!x3Var.f19923f.equals(defaultWindowInsets3) || !x3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f10577b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    x3Var.f19923f = defaultWindowInsets3;
                    x3Var.h = defaultWindowInsets4;
                    x3Var.requestLayout();
                }
                int childCount2 = x3Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = x3Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, l1Var);
                    }
                    i11++;
                }
                x3Var.invalidate();
                return r0.l1.f42139b;
            case 4:
                r0.i1 i1Var = l1Var.f42140a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.b f7 = i1Var.f(527);
                    rect.set(f7.f10576a, f7.f10577b, f7.f10578c, f7.d);
                } else {
                    rect.set(i1Var.i().f10576a, i1Var.i().f10577b, i1Var.i().f10578c, i1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return l1Var;
            case 6:
                return ((e3) obj).onApplyWindowInsetsToRoot(view, l1Var);
            case 7:
                v3 v3Var = (v3) obj;
                v3Var.f19869s = l1Var.f42140a.f(2).d;
                v3Var.invalidate();
                return r0.l1.f42139b;
        }
    }

    @Override
    public void f(a2 a2Var, int i10) {
        a2 a2Var2 = (a2) this.f19656b;
        DialogInterface.OnCancelListener onCancelListener = a2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(a2Var2);
        }
        a2Var2.dismiss();
    }

    @Override
    public void p(KeyEvent keyEvent) {
        m1 m1Var;
        u0 u0Var = (u0) this.f19656b;
        u0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = u0Var.d) != null && m1Var.isShowing()) {
            u0Var.d.d(true);
        }
    }
}
