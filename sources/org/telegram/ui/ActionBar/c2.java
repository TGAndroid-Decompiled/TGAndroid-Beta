package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class c2 extends AnimatorListenerAdapter {
    public final int f18544a;
    public final f2 f18545b;

    public c2(f2 f2Var, int i10) {
        this.f18544a = i10;
        this.f18545b = f2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f18544a) {
            case 0:
                f2 f2Var = this.f18545b;
                DialogInterface.OnShowListener onShowListener = f2Var.f18639i1;
                if (onShowListener != null) {
                    onShowListener.onShow(f2Var);
                    return;
                }
                return;
            default:
                f2 f2Var2 = this.f18545b;
                f2Var2.s().removeView(f2Var2.f18636f1);
                DialogInterface.OnDismissListener onDismissListener = f2Var2.f18640j1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(f2Var2);
                    return;
                }
                return;
        }
    }
}
