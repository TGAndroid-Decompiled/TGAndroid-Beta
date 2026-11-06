package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class v1 extends AnimatorListenerAdapter {
    public final int f28609a;
    public final x1 f28610b;

    public v1(x1 x1Var, int i7) {
        this.f28609a = i7;
        this.f28610b = x1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28609a) {
            case 0:
                x1 x1Var = this.f28610b;
                DialogInterface.OnShowListener onShowListener = x1Var.f28738p1;
                if (onShowListener != null) {
                    onShowListener.onShow(x1Var);
                    return;
                }
                return;
            default:
                x1 x1Var2 = this.f28610b;
                x1Var2.u().removeView(x1Var2.f28736m1);
                DialogInterface.OnDismissListener onDismissListener = x1Var2.f28739q1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(x1Var2);
                    return;
                }
                return;
        }
    }
}
