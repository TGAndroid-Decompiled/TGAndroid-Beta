package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class d20 extends AnimatorListenerAdapter {
    public final int f23468a;
    public final e20 f23469b;

    public d20(e20 e20Var, int i10) {
        this.f23468a = i10;
        this.f23469b = e20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23468a) {
            case 0:
                e20 e20Var = this.f23469b;
                NotificationCenter.getInstance(e20Var.f23718r.f23975a).onAnimationFinish(e20Var.f23716f);
                e20Var.requestLayout();
                return;
            default:
                e20 e20Var2 = this.f23469b;
                e20Var2.d = null;
                e20Var2.f23713a = null;
                e20Var2.f23714b = false;
                return;
        }
    }
}
