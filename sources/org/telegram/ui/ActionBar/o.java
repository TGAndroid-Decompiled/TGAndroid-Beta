package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o implements r0.o, m1, b2 {
    public final int f23700a;
    public final Object f23701b;

    public o(Object obj, int i10) {
        this.f23700a = i10;
        this.f23701b = obj;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int i10 = this.f23700a;
        int i11 = 0;
        Object obj = this.f23701b;
        switch (i10) {
            case 0:
                return ((o2) obj).onInsetsInternal(view, m1Var);
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.l1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, true);
                actionBarLayout.f22680j1 = defaultWindowInsets;
                actionBarLayout.f22682k1 = defaultWindowInsets2;
                actionBarLayout.f22678i1 = m1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), m1Var);
                    i11++;
                }
                return r0.m1.f46842b;
            case 2:
            case 3:
            case 5:
            default:
                x3 x3Var = (x3) obj;
                x3Var.f23966e = m1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(m1Var, true);
                if (!x3Var.f23967f.equals(defaultWindowInsets3) || !x3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f8187b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    x3Var.f23967f = defaultWindowInsets3;
                    x3Var.h = defaultWindowInsets4;
                    x3Var.requestLayout();
                }
                int childCount2 = x3Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = x3Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.j0.b(childAt, m1Var);
                    }
                    i11++;
                }
                x3Var.invalidate();
                return r0.m1.f46842b;
            case 4:
                r0.j1 j1Var = m1Var.f46843a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.b f9 = j1Var.f(527);
                    rect.set(f9.f8186a, f9.f8187b, f9.f8188c, f9.d);
                } else {
                    rect.set(j1Var.i().f8186a, j1Var.i().f8187b, j1Var.i().f8188c, j1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return m1Var;
            case 6:
                v3 v3Var = (v3) obj;
                v3Var.f23886s = m1Var.f46843a.f(2).d;
                v3Var.invalidate();
                return r0.m1.f46842b;
        }
    }

    @Override
    public void g(c2 c2Var, int i10) {
        c2 c2Var2 = (c2) this.f23701b;
        DialogInterface.OnCancelListener onCancelListener = c2Var2.F;
        if (onCancelListener != null) {
            onCancelListener.onCancel(c2Var2);
        }
        c2Var2.dismiss();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        o1 o1Var;
        w0 w0Var = (w0) this.f23701b;
        w0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = w0Var.d) != null && o1Var.isShowing()) {
            w0Var.d.d(true);
        }
    }
}
