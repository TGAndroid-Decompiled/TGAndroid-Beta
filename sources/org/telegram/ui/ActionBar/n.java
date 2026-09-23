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
    public final int f19398a;
    public final Object f19399b;

    public n(Object obj, int i10) {
        this.f19398a = i10;
        this.f19399b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = this.f19398a;
        int i11 = 0;
        Object obj = this.f19399b;
        switch (i10) {
            case 0:
                return ((n2) obj).onInsetsInternal(view, l1Var);
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f18347p1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                actionBarLayout.f18380n1 = defaultWindowInsets;
                actionBarLayout.f18382o1 = defaultWindowInsets2;
                actionBarLayout.f18377m1 = l1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), l1Var);
                    i11++;
                }
                return r0.l1.f41806b;
            case 2:
            case 3:
            case 5:
            default:
                y3 y3Var = (y3) obj;
                y3Var.e = l1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                if (!y3Var.f19696f.equals(defaultWindowInsets3) || !y3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f10577b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    y3Var.f19696f = defaultWindowInsets3;
                    y3Var.h = defaultWindowInsets4;
                    y3Var.requestLayout();
                }
                int childCount2 = y3Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = y3Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, l1Var);
                    }
                    i11++;
                }
                y3Var.invalidate();
                return r0.l1.f41806b;
            case 4:
                r0.i1 i1Var = l1Var.f41807a;
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
                return ((f3) obj).onApplyWindowInsetsToRoot(view, l1Var);
            case 7:
                w3 w3Var = (w3) obj;
                w3Var.f19642s = l1Var.f41807a.f(2).d;
                w3Var.invalidate();
                return r0.l1.f41806b;
        }
    }

    @Override
    public void f(b2 b2Var, int i10) {
        b2 b2Var2 = (b2) this.f19399b;
        DialogInterface.OnCancelListener onCancelListener = b2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(b2Var2);
        }
        b2Var2.dismiss();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        n1 n1Var;
        v0 v0Var = (v0) this.f19399b;
        v0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = v0Var.d) != null && n1Var.isShowing()) {
            v0Var.d.d(true);
        }
    }
}
