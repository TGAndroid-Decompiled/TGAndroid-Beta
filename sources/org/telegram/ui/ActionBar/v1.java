package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class v1 extends AnimatorListenerAdapter {
    public final int f28618a;
    public final x1 f28619b;

    public v1(x1 x1Var, int i7) {
        this.f28618a = i7;
        this.f28619b = x1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28618a) {
            case 0:
                x1 x1Var = this.f28619b;
                DialogInterface.OnShowListener onShowListener = x1Var.f28742p1;
                if (onShowListener != null) {
                    onShowListener.onShow(x1Var);
                    return;
                }
                return;
            default:
                x1 x1Var2 = this.f28619b;
                x1Var2.u().removeView(x1Var2.f28740m1);
                DialogInterface.OnDismissListener onDismissListener = x1Var2.f28743q1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(x1Var2);
                    return;
                }
                return;
        }
    }
}
