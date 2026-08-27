package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class n implements r0.o, l1, a2 {

    public final int f23672a;

    public final Object f23673b;

    public n(Object obj, int i10) {
        this.f23672a = i10;
        this.f23673b = obj;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int i10 = this.f23672a;
        int i11 = 0;
        Object obj = this.f23673b;
        switch (i10) {
            case 0:
                return ((n2) obj).onInsetsInternal(view, m1Var);
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.l1;
                i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                i0.c defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, true);
                actionBarLayout.f22668j1 = defaultWindowInsets;
                actionBarLayout.f22670k1 = defaultWindowInsets2;
                actionBarLayout.f22666i1 = m1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), m1Var);
                    i11++;
                }
                return r0.m1.f46618b;
            case 2:
            case 3:
            case 5:
            default:
                x3 x3Var = (x3) obj;
                x3Var.f23952e = m1Var;
                i0.c defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                i0.c defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(m1Var, true);
                if (!x3Var.f23953f.equals(defaultWindowInsets3) || !x3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f10490b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    x3Var.f23953f = defaultWindowInsets3;
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
                return r0.m1.f46618b;
            case 4:
                r0.j1 j1Var = m1Var.f46619a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.c cVarF = j1Var.f(527);
                    rect.set(cVarF.f10489a, cVarF.f10490b, cVarF.f10491c, cVarF.d);
                } else {
                    rect.set(j1Var.i().f10489a, j1Var.i().f10490b, j1Var.i().f10491c, j1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return m1Var;
            case 6:
                v3 v3Var = (v3) obj;
                v3Var.f23896s = m1Var.f46619a.f(2).d;
                v3Var.invalidate();
                return r0.m1.f46618b;
        }
    }

    @Override
    public void f(b2 b2Var, int i10) {
        b2 b2Var2 = (b2) this.f23673b;
        DialogInterface.OnCancelListener onCancelListener = b2Var2.F;
        if (onCancelListener != null) {
            onCancelListener.onCancel(b2Var2);
        }
        b2Var2.dismiss();
    }

    @Override
    public void k(KeyEvent keyEvent) {
        n1 n1Var;
        v0 v0Var = (v0) this.f23673b;
        v0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = v0Var.d) != null && n1Var.isShowing()) {
            v0Var.d.d(true);
        }
    }
}
