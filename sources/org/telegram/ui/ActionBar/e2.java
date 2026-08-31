package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class e2 extends AnimatorListenerAdapter {
    public final int f21306a;
    public final h2 f21307b;

    public e2(h2 h2Var, int i10) {
        this.f21306a = i10;
        this.f21307b = h2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21306a) {
            case 0:
                h2 h2Var = this.f21307b;
                DialogInterface.OnShowListener onShowListener = h2Var.f21412f1;
                if (onShowListener != null) {
                    onShowListener.onShow(h2Var);
                    return;
                }
                return;
            default:
                h2 h2Var2 = this.f21307b;
                h2Var2.s().removeView(h2Var2.f21409c1);
                DialogInterface.OnDismissListener onDismissListener = h2Var2.f21413g1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(h2Var2);
                    return;
                }
                return;
        }
    }
}
