package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class d20 extends AnimatorListenerAdapter {
    public final int f23188a;
    public final e20 f23189b;

    public d20(e20 e20Var, int i10) {
        this.f23188a = i10;
        this.f23189b = e20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23188a) {
            case 0:
                e20 e20Var = this.f23189b;
                NotificationCenter.getInstance(e20Var.f23461r.f23731a).onAnimationFinish(e20Var.f23459f);
                e20Var.requestLayout();
                return;
            default:
                e20 e20Var2 = this.f23189b;
                e20Var2.d = null;
                e20Var2.f23456a = null;
                e20Var2.f23457b = false;
                return;
        }
    }
}
