package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class b2 extends AnimatorListenerAdapter {
    public final int f20499a;
    public final e2 f20500b;

    public b2(e2 e2Var, int i10) {
        this.f20499a = i10;
        this.f20500b = e2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20499a) {
            case 0:
                e2 e2Var = this.f20500b;
                DialogInterface.OnShowListener onShowListener = e2Var.f20601i1;
                if (onShowListener != null) {
                    onShowListener.onShow(e2Var);
                    return;
                }
                return;
            default:
                e2 e2Var2 = this.f20500b;
                e2Var2.s().removeView(e2Var2.f20598f1);
                DialogInterface.OnDismissListener onDismissListener = e2Var2.f20602j1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(e2Var2);
                    return;
                }
                return;
        }
    }
}
