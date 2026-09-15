package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class d20 extends AnimatorListenerAdapter {
    public final int f23189a;
    public final e20 f23190b;

    public d20(e20 e20Var, int i10) {
        this.f23189a = i10;
        this.f23190b = e20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23189a) {
            case 0:
                e20 e20Var = this.f23190b;
                NotificationCenter.getInstance(e20Var.f23496r.f23782a).onAnimationFinish(e20Var.f23494f);
                e20Var.requestLayout();
                return;
            default:
                e20 e20Var2 = this.f23190b;
                e20Var2.d = null;
                e20Var2.f23491a = null;
                e20Var2.f23492b = false;
                return;
        }
    }
}
