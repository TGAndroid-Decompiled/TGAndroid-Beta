package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class u20 extends AnimatorListenerAdapter {
    public final int f31345a;
    public final v20 f31346b;

    public u20(v20 v20Var, int i10) {
        this.f31345a = i10;
        this.f31346b = v20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31345a) {
            case 0:
                v20 v20Var = this.f31346b;
                NotificationCenter.getInstance(v20Var.f31673r.f32523a).onAnimationFinish(v20Var.f31671f);
                v20Var.requestLayout();
                return;
            default:
                v20 v20Var2 = this.f31346b;
                v20Var2.d = null;
                v20Var2.f31667a = null;
                v20Var2.f31668b = false;
                return;
        }
    }
}
