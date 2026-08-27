package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

public final class c2 extends AnimatorListenerAdapter {

    public final int f22805a;

    public final f2 f22806b;

    public c2(f2 f2Var, int i10) {
        this.f22805a = i10;
        this.f22806b = f2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22805a) {
            case 0:
                f2 f2Var = this.f22806b;
                DialogInterface.OnShowListener onShowListener = f2Var.f22927e1;
                if (onShowListener != null) {
                    onShowListener.onShow(f2Var);
                }
                break;
            default:
                f2 f2Var2 = this.f22806b;
                f2Var2.s().removeView(f2Var2.f22924b1);
                DialogInterface.OnDismissListener onDismissListener = f2Var2.f22928f1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(f2Var2);
                }
                break;
        }
    }
}
