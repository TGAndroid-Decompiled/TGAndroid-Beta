package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class d20 extends AnimatorListenerAdapter {
    public final int f25208a;
    public final e20 f25209b;

    public d20(e20 e20Var, int i10) {
        this.f25208a = i10;
        this.f25209b = e20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25208a) {
            case 0:
                e20 e20Var = this.f25209b;
                NotificationCenter.getInstance(e20Var.f25553r.f25900a).onAnimationFinish(e20Var.f25551f);
                e20Var.requestLayout();
                return;
            default:
                e20 e20Var2 = this.f25209b;
                e20Var2.d = null;
                e20Var2.f25547a = null;
                e20Var2.f25548b = false;
                return;
        }
    }
}
