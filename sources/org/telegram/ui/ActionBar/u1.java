package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class u1 extends AnimatorListenerAdapter {
    public final int f30043a;
    public final w1 f30044b;

    public u1(w1 w1Var, int i7) {
        this.f30043a = i7;
        this.f30044b = w1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30043a) {
            case 0:
                w1 w1Var = this.f30044b;
                DialogInterface.OnShowListener onShowListener = w1Var.f30134q1;
                if (onShowListener != null) {
                    onShowListener.onShow(w1Var);
                    return;
                }
                return;
            default:
                w1 w1Var2 = this.f30044b;
                w1Var2.u().removeView(w1Var2.n1);
                DialogInterface.OnDismissListener onDismissListener = w1Var2.f30135r1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(w1Var2);
                    return;
                }
                return;
        }
    }
}
