package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class q20 extends AnimatorListenerAdapter {
    public final int f28169a;
    public final r20 f28170b;

    public q20(r20 r20Var, int i10) {
        this.f28169a = i10;
        this.f28170b = r20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28169a) {
            case 0:
                r20 r20Var = this.f28170b;
                NotificationCenter.getInstance(r20Var.f28410r.f28703a).onAnimationFinish(r20Var.f28408f);
                r20Var.requestLayout();
                return;
            default:
                r20 r20Var2 = this.f28170b;
                r20Var2.d = null;
                r20Var2.f28405a = null;
                r20Var2.f28406b = false;
                return;
        }
    }
}
