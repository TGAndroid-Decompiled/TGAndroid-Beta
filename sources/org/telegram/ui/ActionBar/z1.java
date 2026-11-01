package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class z1 extends AnimatorListenerAdapter {
    public final int f21581a;
    public final b2 f21582b;

    public z1(b2 b2Var, int i10) {
        this.f21581a = i10;
        this.f21582b = b2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21581a) {
            case 0:
                b2 b2Var = this.f21582b;
                DialogInterface.OnShowListener onShowListener = b2Var.f20181r1;
                if (onShowListener != null) {
                    onShowListener.onShow(b2Var);
                    return;
                }
                return;
            default:
                b2 b2Var2 = this.f21582b;
                b2Var2.u().removeView(b2Var2.f20178o1);
                DialogInterface.OnDismissListener onDismissListener = b2Var2.f20182s1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(b2Var2);
                    return;
                }
                return;
        }
    }
}
