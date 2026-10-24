package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class d2 extends AnimatorListenerAdapter {
    public final int f20809a;
    public final g2 f20810b;

    public d2(g2 g2Var, int i10) {
        this.f20809a = i10;
        this.f20810b = g2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20809a) {
            case 0:
                g2 g2Var = this.f20810b;
                DialogInterface.OnShowListener onShowListener = g2Var.f20909r1;
                if (onShowListener != null) {
                    onShowListener.onShow(g2Var);
                    return;
                }
                return;
            default:
                g2 g2Var2 = this.f20810b;
                g2Var2.u().removeView(g2Var2.f20906o1);
                DialogInterface.OnDismissListener onDismissListener = g2Var2.f20910s1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(g2Var2);
                    return;
                }
                return;
        }
    }
}
