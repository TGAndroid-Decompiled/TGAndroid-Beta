package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class e2 extends AnimatorListenerAdapter {
    public final int f21308a;
    public final h2 f21309b;

    public e2(h2 h2Var, int i10) {
        this.f21308a = i10;
        this.f21309b = h2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21308a) {
            case 0:
                h2 h2Var = this.f21309b;
                DialogInterface.OnShowListener onShowListener = h2Var.f21414f1;
                if (onShowListener != null) {
                    onShowListener.onShow(h2Var);
                    return;
                }
                return;
            default:
                h2 h2Var2 = this.f21309b;
                h2Var2.s().removeView(h2Var2.f21411c1);
                DialogInterface.OnDismissListener onDismissListener = h2Var2.f21415g1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(h2Var2);
                    return;
                }
                return;
        }
    }
}
