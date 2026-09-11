package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class c2 extends AnimatorListenerAdapter {
    public final int f20312a;
    public final f2 f20313b;

    public c2(f2 f2Var, int i10) {
        this.f20312a = i10;
        this.f20313b = f2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20312a) {
            case 0:
                f2 f2Var = this.f20313b;
                DialogInterface.OnShowListener onShowListener = f2Var.f20418i1;
                if (onShowListener != null) {
                    onShowListener.onShow(f2Var);
                    return;
                }
                return;
            default:
                f2 f2Var2 = this.f20313b;
                f2Var2.s().removeView(f2Var2.f20415f1);
                DialogInterface.OnDismissListener onDismissListener = f2Var2.f20419j1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(f2Var2);
                    return;
                }
                return;
        }
    }
}
