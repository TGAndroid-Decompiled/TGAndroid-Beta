package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class d2 extends AnimatorListenerAdapter {
    public final int f22846a;
    public final g2 f22847b;

    public d2(g2 g2Var, int i10) {
        this.f22846a = i10;
        this.f22847b = g2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22846a) {
            case 0:
                g2 g2Var = this.f22847b;
                DialogInterface.OnShowListener onShowListener = g2Var.f22979e1;
                if (onShowListener != null) {
                    onShowListener.onShow(g2Var);
                    return;
                }
                return;
            default:
                g2 g2Var2 = this.f22847b;
                g2Var2.s().removeView(g2Var2.f22976b1);
                DialogInterface.OnDismissListener onDismissListener = g2Var2.f22980f1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(g2Var2);
                    return;
                }
                return;
        }
    }
}
