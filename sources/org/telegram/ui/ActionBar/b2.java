package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class b2 extends AnimatorListenerAdapter {
    public final int f20236a;
    public final e2 f20237b;

    public b2(e2 e2Var, int i10) {
        this.f20236a = i10;
        this.f20237b = e2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20236a) {
            case 0:
                e2 e2Var = this.f20237b;
                DialogInterface.OnShowListener onShowListener = e2Var.f20339i1;
                if (onShowListener != null) {
                    onShowListener.onShow(e2Var);
                    return;
                }
                return;
            default:
                e2 e2Var2 = this.f20237b;
                e2Var2.s().removeView(e2Var2.f20336f1);
                DialogInterface.OnDismissListener onDismissListener = e2Var2.f20340j1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(e2Var2);
                    return;
                }
                return;
        }
    }
}
