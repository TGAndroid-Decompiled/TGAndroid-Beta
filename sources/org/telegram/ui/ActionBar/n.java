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
    public final int f21169a;
    public final Object f21170b;

    public n(Object obj, int i10) {
        this.f21169a = i10;
        this.f21170b = obj;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = this.f21169a;
        int i11 = 0;
        Object obj = this.f21170b;
        switch (i10) {
            case 0:
                return ((m2) obj).onInsetsInternal(view, k1Var);
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f20078p1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, true);
                actionBarLayout.f20112n1 = defaultWindowInsets;
                actionBarLayout.f20114o1 = defaultWindowInsets2;
                actionBarLayout.f20109m1 = k1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), k1Var);
                    i11++;
                }
                return r0.k1.f46999b;
            case 2:
            case 3:
            case 5:
            default:
                x3 x3Var = (x3) obj;
                x3Var.f21455e = k1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(k1Var, true);
                if (!x3Var.f21456f.equals(defaultWindowInsets3) || !x3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f11575b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    x3Var.f21456f = defaultWindowInsets3;
                    x3Var.h = defaultWindowInsets4;
                    x3Var.requestLayout();
                }
                int childCount2 = x3Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = x3Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, k1Var);
                    }
                    i11++;
                }
                x3Var.invalidate();
                return r0.k1.f46999b;
            case 4:
                r0.h1 h1Var = k1Var.f47000a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.b f7 = h1Var.f(527);
                    rect.set(f7.f11574a, f7.f11575b, f7.f11576c, f7.d);
                } else {
                    rect.set(h1Var.i().f11574a, h1Var.i().f11575b, h1Var.i().f11576c, h1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return k1Var;
            case 6:
                return ((e3) obj).onApplyWindowInsetsToRoot(view, k1Var);
            case 7:
                v3 v3Var = (v3) obj;
                v3Var.f21396s = k1Var.f47000a.f(2).d;
                v3Var.invalidate();
                return r0.k1.f46999b;
        }
    }

    @Override
    public void f(a2 a2Var, int i10) {
        a2 a2Var2 = (a2) this.f21170b;
        DialogInterface.OnCancelListener onCancelListener = a2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(a2Var2);
        }
        a2Var2.dismiss();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        m1 m1Var;
        u0 u0Var = (u0) this.f21170b;
        u0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = u0Var.d) != null && m1Var.isShowing()) {
            u0Var.d.d(true);
        }
    }
}
