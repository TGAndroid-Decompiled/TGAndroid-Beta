package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class b2 extends AnimatorListenerAdapter {
    public final int f19338a;
    public final e2 f19339b;

    public b2(e2 e2Var, int i10) {
        this.f19338a = i10;
        this.f19339b = e2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19338a) {
            case 0:
                e2 e2Var = this.f19339b;
                DialogInterface.OnShowListener onShowListener = e2Var.f19435i1;
                if (onShowListener != null) {
                    onShowListener.onShow(e2Var);
                    return;
                }
                return;
            default:
                e2 e2Var2 = this.f19339b;
                e2Var2.s().removeView(e2Var2.f19432f1);
                DialogInterface.OnDismissListener onDismissListener = e2Var2.f19436j1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(e2Var2);
                    return;
                }
                return;
        }
    }
}
