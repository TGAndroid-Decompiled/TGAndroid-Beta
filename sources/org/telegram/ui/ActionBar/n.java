package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class n implements r0.n, k1, a2 {
    public final int f21609a;
    public final Object f21610b;

    public n(Object obj, int i10) {
        this.f21609a = i10;
        this.f21610b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = this.f21609a;
        int i11 = 0;
        Object obj = this.f21610b;
        switch (i10) {
            case 0:
                return ((n2) obj).onInsetsInternal(view, k1Var);
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f20543p1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, true);
                actionBarLayout.f20576n1 = defaultWindowInsets;
                actionBarLayout.f20578o1 = defaultWindowInsets2;
                actionBarLayout.f20573m1 = k1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), k1Var);
                    i11++;
                }
                return r0.k1.f44834b;
            case 2:
            case 3:
            case 5:
            default:
                y3 y3Var = (y3) obj;
                y3Var.e = k1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(k1Var, true);
                if (!y3Var.f21907f.equals(defaultWindowInsets3) || !y3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f12284b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    y3Var.f21907f = defaultWindowInsets3;
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
                return r0.k1.f44834b;
            case 4:
                r0.h1 h1Var = k1Var.f44835a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.b f7 = h1Var.f(527);
                    rect.set(f7.f12283a, f7.f12284b, f7.f12285c, f7.d);
                } else {
                    rect.set(h1Var.i().f12283a, h1Var.i().f12284b, h1Var.i().f12285c, h1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return k1Var;
            case 6:
                return ((f3) obj).onApplyWindowInsetsToRoot(view, k1Var);
            case 7:
                w3 w3Var = (w3) obj;
                w3Var.f21849s = k1Var.f44835a.f(2).d;
                w3Var.invalidate();
                return r0.k1.f44834b;
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        b2 b2Var2 = (b2) this.f21610b;
        DialogInterface.OnCancelListener onCancelListener = b2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(b2Var2);
        }
        b2Var2.dismiss();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        m1 m1Var;
        u0 u0Var = (u0) this.f21610b;
        u0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = u0Var.d) != null && m1Var.isShowing()) {
            u0Var.d.d(true);
        }
    }
}
