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
    public final int f21646a;
    public final Object f21647b;

    public n(Object obj, int i10) {
        this.f21646a = i10;
        this.f21647b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = this.f21646a;
        int i11 = 0;
        Object obj = this.f21647b;
        switch (i10) {
            case 0:
                return ((o2) obj).onInsetsInternal(view, k1Var);
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f20610v1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, true);
                actionBarLayout.f20657t1 = defaultWindowInsets;
                actionBarLayout.f20659u1 = defaultWindowInsets2;
                actionBarLayout.f20655s1 = k1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), k1Var);
                    i11++;
                }
                return r0.k1.f45250b;
            case 2:
            case 3:
            case 5:
            default:
                b4 b4Var = (b4) obj;
                b4Var.e = k1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(k1Var, true);
                if (!b4Var.f20732f.equals(defaultWindowInsets3) || !b4Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f12316b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    b4Var.f20732f = defaultWindowInsets3;
                    b4Var.h = defaultWindowInsets4;
                    b4Var.requestLayout();
                }
                int childCount2 = b4Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = b4Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, k1Var);
                    }
                    i11++;
                }
                b4Var.invalidate();
                return r0.k1.f45250b;
            case 4:
                r0.h1 h1Var = k1Var.f45251a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.b f7 = h1Var.f(527);
                    rect.set(f7.f12315a, f7.f12316b, f7.f12317c, f7.d);
                } else {
                    rect.set(h1Var.i().f12315a, h1Var.i().f12316b, h1Var.i().f12317c, h1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return k1Var;
            case 6:
                return ((h3) obj).onApplyWindowInsetsToRoot(view, k1Var);
            case 7:
                z3 z3Var = (z3) obj;
                z3Var.f22038s = k1Var.f45251a.f(2).d;
                z3Var.invalidate();
                return r0.k1.f45250b;
        }
    }

    @Override
    public void g(c2 c2Var, int i10) {
        c2 c2Var2 = (c2) this.f21647b;
        DialogInterface.OnCancelListener onCancelListener = c2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(c2Var2);
        }
        c2Var2.dismiss();
    }

    @Override
    public void j(KeyEvent keyEvent) {
        m1 m1Var;
        u0 u0Var = (u0) this.f21647b;
        u0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = u0Var.d) != null && m1Var.isShowing()) {
            u0Var.d.d(true);
        }
    }
}
