package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class u1 extends AnimatorListenerAdapter {
    public final int f29677a;
    public final w1 f29678b;

    public u1(w1 w1Var, int i7) {
        this.f29677a = i7;
        this.f29678b = w1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29677a) {
            case 0:
                w1 w1Var = this.f29678b;
                DialogInterface.OnShowListener onShowListener = w1Var.f29797q1;
                if (onShowListener != null) {
                    onShowListener.onShow(w1Var);
                    return;
                }
                return;
            default:
                w1 w1Var2 = this.f29678b;
                w1Var2.u().removeView(w1Var2.n1);
                DialogInterface.OnDismissListener onDismissListener = w1Var2.f29798r1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(w1Var2);
                    return;
                }
                return;
        }
    }
}
