package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class t1 extends AnimatorListenerAdapter {
    public final int f28580a;
    public final v1 f28581b;

    public t1(v1 v1Var, int i3) {
        this.f28580a = i3;
        this.f28581b = v1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28580a) {
            case 0:
                v1 v1Var = this.f28581b;
                DialogInterface.OnShowListener onShowListener = v1Var.f28736s1;
                if (onShowListener != null) {
                    onShowListener.onShow(v1Var);
                    return;
                }
                return;
            default:
                v1 v1Var2 = this.f28581b;
                v1Var2.u().removeView(v1Var2.f28733p1);
                DialogInterface.OnDismissListener onDismissListener = v1Var2.f28737t1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(v1Var2);
                    return;
                }
                return;
        }
    }
}
