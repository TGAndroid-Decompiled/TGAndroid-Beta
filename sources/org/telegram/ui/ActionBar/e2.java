package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class e2 extends AnimatorListenerAdapter {
    public final int f19651a;
    public final h2 f19652b;

    public e2(h2 h2Var, int i10) {
        this.f19651a = i10;
        this.f19652b = h2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19651a) {
            case 0:
                h2 h2Var = this.f19652b;
                DialogInterface.OnShowListener onShowListener = h2Var.f19750f1;
                if (onShowListener != null) {
                    onShowListener.onShow(h2Var);
                    return;
                }
                return;
            default:
                h2 h2Var2 = this.f19652b;
                h2Var2.s().removeView(h2Var2.f19747c1);
                DialogInterface.OnDismissListener onDismissListener = h2Var2.f19751g1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(h2Var2);
                    return;
                }
                return;
        }
    }
}
