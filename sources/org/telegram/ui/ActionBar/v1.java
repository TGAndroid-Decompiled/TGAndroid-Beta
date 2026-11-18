package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class v1 extends AnimatorListenerAdapter {
    public final int f30093a;
    public final x1 f30094b;

    public v1(x1 x1Var, int i7) {
        this.f30093a = i7;
        this.f30094b = x1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30093a) {
            case 0:
                x1 x1Var = this.f30094b;
                DialogInterface.OnShowListener onShowListener = x1Var.f30184q1;
                if (onShowListener != null) {
                    onShowListener.onShow(x1Var);
                    return;
                }
                return;
            default:
                x1 x1Var2 = this.f30094b;
                x1Var2.u().removeView(x1Var2.n1);
                DialogInterface.OnDismissListener onDismissListener = x1Var2.f30185r1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(x1Var2);
                    return;
                }
                return;
        }
    }
}
