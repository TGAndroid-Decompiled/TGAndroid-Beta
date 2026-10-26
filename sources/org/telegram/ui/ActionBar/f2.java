package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class f2 extends AnimatorListenerAdapter {
    public final int f22620a;
    public final i2 f22621b;

    public f2(i2 i2Var, int i10) {
        this.f22620a = i10;
        this.f22621b = i2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22620a) {
            case 0:
                i2 i2Var = this.f22621b;
                DialogInterface.OnShowListener onShowListener = i2Var.f22711r1;
                if (onShowListener != null) {
                    onShowListener.onShow(i2Var);
                    return;
                }
                return;
            default:
                i2 i2Var2 = this.f22621b;
                i2Var2.u().removeView(i2Var2.f22708o1);
                DialogInterface.OnDismissListener onDismissListener = i2Var2.f22712s1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(i2Var2);
                    return;
                }
                return;
        }
    }
}
