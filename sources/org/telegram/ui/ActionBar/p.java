package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p implements r0.n, l1, a2 {
    public final int f21448a;
    public final Object f21449b;

    public p(Object obj, int i10) {
        this.f21448a = i10;
        this.f21449b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = this.f21448a;
        int i11 = 0;
        Object obj = this.f21449b;
        switch (i10) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f20313p1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                actionBarLayout.f20347n1 = defaultWindowInsets;
                actionBarLayout.f20349o1 = defaultWindowInsets2;
                actionBarLayout.f20344m1 = l1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), l1Var);
                    i11++;
                }
                return r0.l1.f45623b;
            case 1:
            case 2:
            case 4:
            default:
                y3 y3Var = (y3) obj;
                y3Var.f21722e = l1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                if (!y3Var.f21723f.equals(defaultWindowInsets3) || !y3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.f11527b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    y3Var.f21723f = defaultWindowInsets3;
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
                return r0.l1.f45623b;
            case 3:
                r0.i1 i1Var = l1Var.f45624a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.b f7 = i1Var.f(527);
                    rect.set(f7.f11526a, f7.f11527b, f7.f11528c, f7.d);
                } else {
                    rect.set(i1Var.i().f11526a, i1Var.i().f11527b, i1Var.i().f11528c, i1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                return l1Var;
            case 5:
                return ((f3) obj).onApplyWindowInsetsToRoot(view, l1Var);
            case 6:
                w3 w3Var = (w3) obj;
                w3Var.f21665s = l1Var.f45624a.f(2).d;
                w3Var.invalidate();
                return r0.l1.f45623b;
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        b2 b2Var2 = (b2) this.f21449b;
        DialogInterface.OnCancelListener onCancelListener = b2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(b2Var2);
        }
        b2Var2.dismiss();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        n1 n1Var;
        v0 v0Var = (v0) this.f21449b;
        v0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = v0Var.d) != null && n1Var.isShowing()) {
            v0Var.d.d(true);
        }
    }
}
