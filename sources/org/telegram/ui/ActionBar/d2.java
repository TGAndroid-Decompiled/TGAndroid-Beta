package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class d2 extends AnimatorListenerAdapter {
    public final int f20808a;
    public final g2 f20809b;

    public d2(g2 g2Var, int i10) {
        this.f20808a = i10;
        this.f20809b = g2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20808a) {
            case 0:
                g2 g2Var = this.f20809b;
                DialogInterface.OnShowListener onShowListener = g2Var.f20908r1;
                if (onShowListener != null) {
                    onShowListener.onShow(g2Var);
                    return;
                }
                return;
            default:
                g2 g2Var2 = this.f20809b;
                g2Var2.u().removeView(g2Var2.f20905o1);
                DialogInterface.OnDismissListener onDismissListener = g2Var2.f20909s1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(g2Var2);
                    return;
                }
                return;
        }
    }
}
