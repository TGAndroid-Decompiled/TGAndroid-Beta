package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class e2 extends AnimatorListenerAdapter {
    public final int f17666a;
    public final h2 f17667b;

    public e2(h2 h2Var, int i10) {
        this.f17666a = i10;
        this.f17667b = h2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f17666a) {
            case 0:
                h2 h2Var = this.f17667b;
                DialogInterface.OnShowListener onShowListener = h2Var.f17764i1;
                if (onShowListener != null) {
                    onShowListener.onShow(h2Var);
                    return;
                }
                return;
            default:
                h2 h2Var2 = this.f17667b;
                h2Var2.s().removeView(h2Var2.f17761f1);
                DialogInterface.OnDismissListener onDismissListener = h2Var2.f17765j1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(h2Var2);
                    return;
                }
                return;
        }
    }
}
