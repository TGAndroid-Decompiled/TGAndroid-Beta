package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class e2 extends AnimatorListenerAdapter {
    public final int f19626a;
    public final h2 f19627b;

    public e2(h2 h2Var, int i10) {
        this.f19626a = i10;
        this.f19627b = h2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19626a) {
            case 0:
                h2 h2Var = this.f19627b;
                DialogInterface.OnShowListener onShowListener = h2Var.f19725f1;
                if (onShowListener != null) {
                    onShowListener.onShow(h2Var);
                    return;
                }
                return;
            default:
                h2 h2Var2 = this.f19627b;
                h2Var2.s().removeView(h2Var2.f19722c1);
                DialogInterface.OnDismissListener onDismissListener = h2Var2.f19726g1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(h2Var2);
                    return;
                }
                return;
        }
    }
}
