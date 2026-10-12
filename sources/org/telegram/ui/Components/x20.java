package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class x20 extends AnimatorListenerAdapter {
    public final int f32621a;
    public final y20 f32622b;

    public x20(y20 y20Var, int i10) {
        this.f32621a = i10;
        this.f32622b = y20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32621a) {
            case 0:
                y20 y20Var = this.f32622b;
                NotificationCenter.getInstance(y20Var.f32928r.f33264a).onAnimationFinish(y20Var.f32926f);
                y20Var.requestLayout();
                return;
            default:
                y20 y20Var2 = this.f32622b;
                y20Var2.d = null;
                y20Var2.f32922a = null;
                y20Var2.f32923b = false;
                return;
        }
    }
}
