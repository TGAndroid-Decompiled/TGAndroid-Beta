package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class q20 extends AnimatorListenerAdapter {
    public final int f28488a;
    public final r20 f28489b;

    public q20(r20 r20Var, int i10) {
        this.f28488a = i10;
        this.f28489b = r20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28488a) {
            case 0:
                r20 r20Var = this.f28489b;
                NotificationCenter.getInstance(r20Var.f28720r.f28998a).onAnimationFinish(r20Var.f28718f);
                r20Var.requestLayout();
                return;
            default:
                r20 r20Var2 = this.f28489b;
                r20Var2.d = null;
                r20Var2.f28715a = null;
                r20Var2.f28716b = false;
                return;
        }
    }
}
