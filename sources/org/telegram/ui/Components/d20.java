package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class d20 extends AnimatorListenerAdapter {
    public final int f25182a;
    public final e20 f25183b;

    public d20(e20 e20Var, int i10) {
        this.f25182a = i10;
        this.f25183b = e20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25182a) {
            case 0:
                e20 e20Var = this.f25183b;
                NotificationCenter.getInstance(e20Var.f25527r.f25874a).onAnimationFinish(e20Var.f25525f);
                e20Var.requestLayout();
                return;
            default:
                e20 e20Var2 = this.f25183b;
                e20Var2.d = null;
                e20Var2.f25521a = null;
                e20Var2.f25522b = false;
                return;
        }
    }
}
