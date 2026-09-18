package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class d2 extends AnimatorListenerAdapter {
    public final int f18571a;
    public final g2 f18572b;

    public d2(g2 g2Var, int i10) {
        this.f18571a = i10;
        this.f18572b = g2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f18571a) {
            case 0:
                g2 g2Var = this.f18572b;
                DialogInterface.OnShowListener onShowListener = g2Var.f18669i1;
                if (onShowListener != null) {
                    onShowListener.onShow(g2Var);
                    return;
                }
                return;
            default:
                g2 g2Var2 = this.f18572b;
                g2Var2.s().removeView(g2Var2.f18666f1);
                DialogInterface.OnDismissListener onDismissListener = g2Var2.f18670j1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(g2Var2);
                    return;
                }
                return;
        }
    }
}
