package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o implements r0.n, n1, c2 {
    public final int f18514a;
    public final Object f18515b;

    public o(Object obj, int i10) {
        this.f18514a = i10;
        this.f18515b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = this.f18514a;
        int i11 = 0;
        Object obj = this.f18515b;
        switch (i10) {
            case 0:
                return ((p2) obj).onInsetsInternal(view, l1Var);
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f17466p1;
                i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.c defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                actionBarLayout.f17499n1 = defaultWindowInsets;
                actionBarLayout.f17501o1 = defaultWindowInsets2;
                actionBarLayout.f17496m1 = l1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), l1Var);
                    i11++;
                }
                return r0.l1.f41073b;
            case 2:
            case 3:
            case 5:
            default:
                b4 b4Var = (b4) obj;
                b4Var.e = l1Var;
                i0.c defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.c defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                if (!b4Var.f17552f.equals(defaultWindowInsets3) || !b4Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f10075b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    b4Var.f17552f = defaultWindowInsets3;
                    b4Var.h = defaultWindowInsets4;
                    b4Var.requestLayout();
                }
                int childCount2 = b4Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = b4Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, l1Var);
                    }
                    i11++;
                }
                b4Var.invalidate();
                return r0.l1.f41073b;
            case 4:
                r0.i1 i1Var = l1Var.f41074a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.c f7 = i1Var.f(527);
                    rect.set(f7.f10074a, f7.f10075b, f7.f10076c, f7.d);
                } else {
                    rect.set(i1Var.i().f10074a, i1Var.i().f10075b, i1Var.i().f10076c, i1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return l1Var;
            case 6:
                return ((h3) obj).onApplyWindowInsetsToRoot(view, l1Var);
            case 7:
                z3 z3Var = (z3) obj;
                z3Var.f18817s = l1Var.f41074a.f(2).d;
                z3Var.invalidate();
                return r0.l1.f41073b;
        }
    }

    @Override
    public void f(d2 d2Var, int i10) {
        d2 d2Var2 = (d2) this.f18515b;
        DialogInterface.OnCancelListener onCancelListener = d2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(d2Var2);
        }
        d2Var2.dismiss();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        p1 p1Var;
        w0 w0Var = (w0) this.f18515b;
        w0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = w0Var.d) != null && p1Var.isShowing()) {
            w0Var.d.d(true);
        }
    }
}
