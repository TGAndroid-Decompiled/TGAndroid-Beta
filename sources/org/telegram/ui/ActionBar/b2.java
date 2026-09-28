package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class b2 extends AnimatorListenerAdapter {
    public final int f18753a;
    public final e2 f18754b;

    public b2(e2 e2Var, int i10) {
        this.f18753a = i10;
        this.f18754b = e2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f18753a) {
            case 0:
                e2 e2Var = this.f18754b;
                DialogInterface.OnShowListener onShowListener = e2Var.f18849i1;
                if (onShowListener != null) {
                    onShowListener.onShow(e2Var);
                    return;
                }
                return;
            default:
                e2 e2Var2 = this.f18754b;
                e2Var2.s().removeView(e2Var2.f18846f1);
                DialogInterface.OnDismissListener onDismissListener = e2Var2.f18850j1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(e2Var2);
                    return;
                }
                return;
        }
    }
}
