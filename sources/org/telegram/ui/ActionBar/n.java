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
    public final int f21405a;
    public final Object f21406b;

    public n(Object obj, int i10) {
        this.f21405a = i10;
        this.f21406b = obj;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = this.f21405a;
        int i11 = 0;
        Object obj = this.f21406b;
        switch (i10) {
            case 0:
                return ((n2) obj).onInsetsInternal(view, k1Var);
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f20310p1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, true);
                actionBarLayout.f20344n1 = defaultWindowInsets;
                actionBarLayout.f20346o1 = defaultWindowInsets2;
                actionBarLayout.f20341m1 = k1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), k1Var);
                    i11++;
                }
                return r0.k1.f46774b;
            case 2:
            case 3:
            case 5:
            default:
                y3 y3Var = (y3) obj;
                y3Var.f21726e = k1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(k1Var, true);
                if (!y3Var.f21727f.equals(defaultWindowInsets3) || !y3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f11577b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    y3Var.f21727f = defaultWindowInsets3;
                    y3Var.h = defaultWindowInsets4;
                    y3Var.requestLayout();
                }
                int childCount2 = y3Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = y3Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, k1Var);
                    }
                    i11++;
                }
                y3Var.invalidate();
                return r0.k1.f46774b;
            case 4:
                r0.h1 h1Var = k1Var.f46775a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.b f7 = h1Var.f(527);
                    rect.set(f7.f11576a, f7.f11577b, f7.f11578c, f7.d);
                } else {
                    rect.set(h1Var.i().f11576a, h1Var.i().f11577b, h1Var.i().f11578c, h1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return k1Var;
            case 6:
                return ((f3) obj).onApplyWindowInsetsToRoot(view, k1Var);
            case 7:
                w3 w3Var = (w3) obj;
                w3Var.f21664s = k1Var.f46775a.f(2).d;
                w3Var.invalidate();
                return r0.k1.f46774b;
        }
    }

    @Override
    public void f(b2 b2Var, int i10) {
        b2 b2Var2 = (b2) this.f21406b;
        DialogInterface.OnCancelListener onCancelListener = b2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(b2Var2);
        }
        b2Var2.dismiss();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        n1 n1Var;
        v0 v0Var = (v0) this.f21406b;
        v0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = v0Var.d) != null && n1Var.isShowing()) {
            v0Var.d.d(true);
        }
    }
}
