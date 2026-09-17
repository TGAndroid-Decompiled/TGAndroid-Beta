package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class d20 extends AnimatorListenerAdapter {
    public final int f25209a;
    public final e20 f25210b;

    public d20(e20 e20Var, int i10) {
        this.f25209a = i10;
        this.f25210b = e20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25209a) {
            case 0:
                e20 e20Var = this.f25210b;
                NotificationCenter.getInstance(e20Var.f25554r.f25901a).onAnimationFinish(e20Var.f25552f);
                e20Var.requestLayout();
                return;
            default:
                e20 e20Var2 = this.f25210b;
                e20Var2.d = null;
                e20Var2.f25548a = null;
                e20Var2.f25549b = false;
                return;
        }
    }
}
