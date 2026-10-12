package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class x20 extends AnimatorListenerAdapter {
    public final int f32622a;
    public final y20 f32623b;

    public x20(y20 y20Var, int i10) {
        this.f32622a = i10;
        this.f32623b = y20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32622a) {
            case 0:
                y20 y20Var = this.f32623b;
                NotificationCenter.getInstance(y20Var.f32935r.f33258a).onAnimationFinish(y20Var.f32933f);
                y20Var.requestLayout();
                return;
            default:
                y20 y20Var2 = this.f32623b;
                y20Var2.d = null;
                y20Var2.f32929a = null;
                y20Var2.f32930b = false;
                return;
        }
    }
}
