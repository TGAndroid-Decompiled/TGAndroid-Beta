package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class z1 extends AnimatorListenerAdapter {
    public final int f21580a;
    public final b2 f21581b;

    public z1(b2 b2Var, int i10) {
        this.f21580a = i10;
        this.f21581b = b2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21580a) {
            case 0:
                b2 b2Var = this.f21581b;
                DialogInterface.OnShowListener onShowListener = b2Var.f20180r1;
                if (onShowListener != null) {
                    onShowListener.onShow(b2Var);
                    return;
                }
                return;
            default:
                b2 b2Var2 = this.f21581b;
                b2Var2.u().removeView(b2Var2.f20177o1);
                DialogInterface.OnDismissListener onDismissListener = b2Var2.f20181s1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(b2Var2);
                    return;
                }
                return;
        }
    }
}
