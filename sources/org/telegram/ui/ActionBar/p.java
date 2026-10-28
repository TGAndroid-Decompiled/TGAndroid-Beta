package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p implements r0.n, m1, b2 {
    public final int f22924a;
    public final Object f22925b;

    public p(Object obj, int i10) {
        this.f22924a = i10;
        this.f22925b = obj;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        int i10 = this.f22924a;
        int i11 = 0;
        Object obj = this.f22925b;
        switch (i10) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f22301v1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, true);
                actionBarLayout.f22348t1 = defaultWindowInsets;
                actionBarLayout.f22350u1 = defaultWindowInsets2;
                actionBarLayout.f22346s1 = k1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), k1Var);
                    i11++;
                }
                return r0.k1.f47152b;
            case 1:
            case 2:
            case 4:
            default:
                d4 d4Var = (d4) obj;
                d4Var.e = k1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(k1Var, true);
                if (!d4Var.f22545f.equals(defaultWindowInsets3) || !d4Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f13450b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    d4Var.f22545f = defaultWindowInsets3;
                    d4Var.h = defaultWindowInsets4;
                    d4Var.requestLayout();
                }
                int childCount2 = d4Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = d4Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, k1Var);
                    }
                    i11++;
                }
                d4Var.invalidate();
                return r0.k1.f47152b;
            case 3:
                r0.h1 h1Var = k1Var.f47153a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.b f7 = h1Var.f(527);
                    rect.set(f7.f13449a, f7.f13450b, f7.f13451c, f7.d);
                } else {
                    rect.set(h1Var.i().f13449a, h1Var.i().f13450b, h1Var.i().f13451c, h1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return k1Var;
            case 5:
                return ((k3) obj).onApplyWindowInsetsToRoot(view, k1Var);
            case 6:
                b4 b4Var = (b4) obj;
                b4Var.f22447s = k1Var.f47153a.f(2).d;
                b4Var.invalidate();
                return r0.k1.f47152b;
        }
    }

    @Override
    public void h(e2 e2Var, int i10) {
        e2 e2Var2 = (e2) this.f22925b;
        DialogInterface.OnCancelListener onCancelListener = e2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(e2Var2);
        }
        e2Var2.dismiss();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        o1 o1Var;
        w0 w0Var = (w0) this.f22925b;
        w0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = w0Var.d) != null && o1Var.isShowing()) {
            w0Var.d.d(true);
        }
    }
}
