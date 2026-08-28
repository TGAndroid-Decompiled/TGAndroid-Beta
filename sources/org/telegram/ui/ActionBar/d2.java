package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class d2 extends AnimatorListenerAdapter {
    public final int f22829a;
    public final g2 f22830b;

    public d2(g2 g2Var, int i9) {
        this.f22829a = i9;
        this.f22830b = g2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22829a) {
            case 0:
                g2 g2Var = this.f22830b;
                DialogInterface.OnShowListener onShowListener = g2Var.f23419e1;
                if (onShowListener != null) {
                    onShowListener.onShow(g2Var);
                    return;
                }
                return;
            default:
                g2 g2Var2 = this.f22830b;
                g2Var2.s().removeView(g2Var2.f23416b1);
                DialogInterface.OnDismissListener onDismissListener = g2Var2.f23420f1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(g2Var2);
                    return;
                }
                return;
        }
    }
}
