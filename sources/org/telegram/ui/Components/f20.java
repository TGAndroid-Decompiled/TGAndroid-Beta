package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class f20 extends AnimatorListenerAdapter {
    public final int f26753a;
    public final g20 f26754b;

    public f20(g20 g20Var, int i10) {
        this.f26753a = i10;
        this.f26754b = g20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26753a) {
            case 0:
                g20 g20Var = this.f26754b;
                NotificationCenter.getInstance(g20Var.f27070r.f27333a).onAnimationFinish(g20Var.f27068f);
                g20Var.requestLayout();
                return;
            default:
                g20 g20Var2 = this.f26754b;
                g20Var2.d = null;
                g20Var2.f27064a = null;
                g20Var2.f27065b = false;
                return;
        }
    }
}
