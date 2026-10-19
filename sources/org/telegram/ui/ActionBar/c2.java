package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class c2 extends AnimatorListenerAdapter {
    public final int f20718a;
    public final f2 f20719b;

    public c2(f2 f2Var, int i10) {
        this.f20718a = i10;
        this.f20719b = f2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20718a) {
            case 0:
                f2 f2Var = this.f20719b;
                DialogInterface.OnShowListener onShowListener = f2Var.f20802i1;
                if (onShowListener != null) {
                    onShowListener.onShow(f2Var);
                    return;
                }
                return;
            default:
                f2 f2Var2 = this.f20719b;
                f2Var2.t().removeView(f2Var2.f20799f1);
                DialogInterface.OnDismissListener onDismissListener = f2Var2.f20803j1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(f2Var2);
                    return;
                }
                return;
        }
    }
}
