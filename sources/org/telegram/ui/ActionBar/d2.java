package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class d2 extends AnimatorListenerAdapter {
    public final int f18796a;
    public final g2 f18797b;

    public d2(g2 g2Var, int i10) {
        this.f18796a = i10;
        this.f18797b = g2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f18796a) {
            case 0:
                g2 g2Var = this.f18797b;
                DialogInterface.OnShowListener onShowListener = g2Var.f18896i1;
                if (onShowListener != null) {
                    onShowListener.onShow(g2Var);
                    return;
                }
                return;
            default:
                g2 g2Var2 = this.f18797b;
                g2Var2.s().removeView(g2Var2.f18893f1);
                DialogInterface.OnDismissListener onDismissListener = g2Var2.f18897j1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(g2Var2);
                    return;
                }
                return;
        }
    }
}
