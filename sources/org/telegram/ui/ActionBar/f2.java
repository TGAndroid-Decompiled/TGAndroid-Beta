package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class f2 extends AnimatorListenerAdapter {
    public final int f22618a;
    public final i2 f22619b;

    public f2(i2 i2Var, int i10) {
        this.f22618a = i10;
        this.f22619b = i2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22618a) {
            case 0:
                i2 i2Var = this.f22619b;
                DialogInterface.OnShowListener onShowListener = i2Var.f22709r1;
                if (onShowListener != null) {
                    onShowListener.onShow(i2Var);
                    return;
                }
                return;
            default:
                i2 i2Var2 = this.f22619b;
                i2Var2.u().removeView(i2Var2.f22706o1);
                DialogInterface.OnDismissListener onDismissListener = i2Var2.f22710s1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(i2Var2);
                    return;
                }
                return;
        }
    }
}
